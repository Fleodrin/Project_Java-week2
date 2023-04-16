package XManagment;

import java.util.Scanner;

public class CustomerManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager(input);
        int num = -1;

        while (num != 5) {
            System.out.println("*** Customer Management System Menu ***");
            System.out.println(" 1. Add Customer");
            System.out.println(" 2. Delete Customer");
            System.out.println(" 3. Edit Customer");
            System.out.println(" 4. View Customers");
            System.out.println(" 5. Exit");
            System.out.println("Select one number between 1 - 5:");
            num = input.nextInt();

            if (num == 1) {
                customerManager.addCustomer();
            } else if (num == 2) {
                customerManager.deleteCustomer();
            } else if (num == 3) {
                customerManager.editCustomer();
            } else if (num == 4) {
                customerManager.viewCustomers();
            } else {
                continue;
            }
        }
    }
}
