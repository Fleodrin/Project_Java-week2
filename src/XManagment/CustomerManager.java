package XManagment;

import java.util.Scanner;

public class CustomerManager {
    Customer customer;
    Scanner input;

    CustomerManager(Scanner input) {
        this.input = input;
    }

    public void addCustomer() {
        customer = new Customer();
        System.out.print("Customer ID:");
        customer.id = input.nextInt();
        System.out.print("Customer name:");
        customer.name = input.next();
        System.out.print("Email address:");
        customer.email = input.next();
        System.out.print("Phone number:");
        customer.phone = input.next();
    }

    public void deleteCustomer() {
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        if (customer == null) {
            System.out.println("The student has not been registered");
            return;
        }
        if (customer.id == customerId) {
            customer = null;
            System.out.println("The student was deleted");
        }
    }

    public void editCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        if (customer.id == customerId) {
            System.out.println("The student to be edited is " + customerId);
        }
    }

    public void viewCustomer() {
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        if (customer.id == customerId) {
            customer.printInfo();
        }
    }
}
