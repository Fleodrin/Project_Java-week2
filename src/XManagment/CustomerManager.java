package XManagment;

import Customer.FoodStoreCustomer;
import Customer.ElectronicStoreCustomer;
import Customer.DepartmentStoreCustomer;
import Customer.CustomerKind;
import Customer.CustomerInput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerManager {
    ArrayList<CustomerInput> customers = new ArrayList<CustomerInput>();
    Scanner input;

    CustomerManager(Scanner input) {
        this.input = input;
    }

    public void addCustomer() {
        int kind = 0;
        CustomerInput customerInput;
        while (kind < 1 || kind > 3) {
            try {
                System.out.print("1 for DepartmentStore\n");
                System.out.print("2 for FoodStore\n");
                System.out.print("3 for ElectronicStore\n");
                System.out.print("Select num 1, 2, 3 for Customer Kind:");
                kind = input.nextInt();
                if (kind == 1) {
                    customerInput = new DepartmentStoreCustomer(CustomerKind.DepartmentStore);
                    customerInput.getUserInput(input);
                    customers.add(customerInput);
                    break;
                } else if (kind == 2) {
                    customerInput = new FoodStoreCustomer(CustomerKind.FoodStore);
                    customerInput.getUserInput(input);
                    customers.add(customerInput);
                    break;
                } else if (kind == 3) {
                    customerInput = new ElectronicStoreCustomer(CustomerKind.ElectronicStore);
                    customerInput.getUserInput(input);
                    customers.add(customerInput);
                    break;
                } else {
                    System.out.println("Select num 1, 2, 3 for Customer Kind:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please put an integer between 1 and 3!");
                if (input.hasNext()) {
                    input.next();
                }
                kind = -1;
            }
        }
    }

    public void deleteCustomer() {
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        int index = findIndex(customerId);
        removeFromCustomers(index, customerId);
    }

    public int findIndex(int customerId) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == customerId) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int removeFromCustomers(int index, int customerId) {
        if (index >= 0) {
            customers.remove(index);
            System.out.println("The customer " + customerId + " was deleted");
            return 1;
        } else {
            System.out.println("The customer has not been registered");
            return -1;
        }
    }

    public void editCustomer() {
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        for (int i = 0; i < customers.size(); i++) {
            CustomerInput customer = customers.get(i);
            if (customer.getId() == customerId) {
                int num = -1;
                while (num != 5) {
                    showEditMenu();
                    num = input.nextInt();
                    switch (num) {
                        case 1:
                            customer.setCustomerID(input);
                            break;
                        case 2:
                            customer.setCustomerName(input);
                            break;
                        case 3:
                            customer.setCustomerEmail(input);
                            break;
                        case 4:
                            customer.setCustomerPhone(input);
                            break;
                        default:
                            continue;
                    }
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


    public void showEditMenu() {
        System.out.println("** Customer Info Edit Menu **");
        System.out.println(" 1. Edit Id");
        System.out.println(" 2. Edit name");
        System.out.println(" 3. Edit Email");
        System.out.println(" 4. View Phone");
        System.out.println(" 5. Exit");
        System.out.println("Select one number between 1 - 5:");
    }
}
