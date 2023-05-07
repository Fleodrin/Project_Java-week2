package XManagment;

import Customer.Customer;
import Customer.FoodStoreCustomer;
import Customer.ElectronicStoreCustomer;
import Customer.CustomerKind;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    Scanner input;

    CustomerManager(Scanner input) {
        this.input = input;
    }

    public void addCustomer() {
        int kind = 0;
        Customer customer;
        while (kind != 1 && kind != 2 && kind != 3) {
            System.out.print("1 for DepartmentStore\n");
            System.out.print("2 for FoodStore\n");
            System.out.print("3 for ElectronicStore\n");
            System.out.print("Select num 1, 2, 3 for Customer Kind:");
            kind = input.nextInt();
            if (kind == 1) {
                customer = new Customer(CustomerKind.DepartmentStore);
                customer.getUserInput(input);
                customers.add(customer);
                break;
            } else if (kind == 2) {
                customer = new FoodStoreCustomer(CustomerKind.FoodStore);
                customer.getUserInput(input);
                customers.add(customer);
                break;
            } else if (kind == 3) {
                customer = new ElectronicStoreCustomer(CustomerKind.ElectronicStore);
                customer.getUserInput(input);
                customers.add(customer);
                break;
            } else {
                System.out.println("Select num 1, 2, 3 for Customer Kind:");
            }
        }
    }

    public void deleteCustomer() {
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == customerId) {
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
            if (customer.getId() == customerId) {
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
                        int id = input.nextInt();
                        customer.setId(id);
                    } else if (num == 2) {
                        System.out.println("Customer name");
                        String name = input.next();
                        customer.setName(name);
                    } else if (num == 3) {
                        System.out.println("Email address");
                        String email = input.next();
                        customer.setEmail(email);
                    } else if (num == 4) {
                        System.out.println("Phone number");
                        String phone = input.next();
                        customer.setPhone(phone);
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
