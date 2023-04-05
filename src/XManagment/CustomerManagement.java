package XManagment;

import java.util.Scanner;

public class CustomerManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5;

        while (num != 6) {
            System.out.println("*** Customer Management System Menu ***");
            System.out.println(" 1. Add Customers");
            System.out.println(" 2. Delete Customers");
            System.out.println(" 3. Edit Customers");
            System.out.println(" 4. View Customers");
            System.out.println(" 5. Show a menu");
            System.out.println(" 6. Exit");
            System.out.println("Select one number between 1 - 6:");
            num = input.nextInt();

            if (num == 1) {
                addCustomer();
            } else if (num == 2) {
                deleteCustomer();
            } else if (num == 3) {
                editCustomer();
            } else if (num == 4) {
                viewCustomer();
            } else {
                continue;
            }
        }
    }

    public static void addCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
        System.out.print("Customer name:");
        String customerName = input.next();
        System.out.print("Email address:");
        String customerEmail = input.next();
        System.out.print("Phone number:");
        String customerPhone = input.next();
    }

    public static void deleteCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
    }

    public static void editCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
    }

    public static void viewCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Customer ID:");
        int customerId = input.nextInt();
    }
}
