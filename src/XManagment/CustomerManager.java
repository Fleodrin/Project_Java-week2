package XManagment;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    Scanner input;

    CustomerManager(Scanner input) {
        this.input = input;
    }

    public void addCustomer() {
        Customer customer = new Customer();
        System.out.print("Customer ID:");
        customer.id = input.nextInt();
        System.out.print("Customer name:");
        customer.name = input.next();
        System.out.print("Email address:");
        customer.email = input.next();
        System.out.print("Phone number:");
        customer.phone = input.next();
        customers.add(customer);
    }

    public void deleteCustomer() {
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).id == customerId) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            customers.remove(index);
            System.out.println("The student " + customerId + " was deleted");
        } else {
            System.out.println("The student has not been registered");
            return;
        }
    }

    public void editCustomer() {
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.id == customerId) {
                int num = -1;
                while (num != 5) {
                    System.out.println("** Customer Info Edit Menu **");
                    System.out.println(" 1. Edit Id");
                    System.out.println(" 2. Edit name");
                    System.out.println(" 3. Edit Email");
                    System.out.println(" 4. View Phone");
                    System.out.println(" 5. Exit");
                    System.out.println("Select one number between 1 - 5:");
                    num = input.nextInt();

                    if (num == 1) {
                        System.out.println("Customer Id");
                        customer.id = input.nextInt();
                    } else if (num == 2) {
                        System.out.println("Customer name");
                        customer.name = input.next();
                    } else if (num == 3) {
                        System.out.println("Email address");
                        customer.email = input.next();
                    } else if (num == 4) {
                        System.out.println("Phone number");
                        customer.phone = input.next();
                    } else {
                        continue;
                    } // if
                } // while
                break;
            } // if
        } // for
    }

    public void viewCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).printInfo();
        }
    }
}
