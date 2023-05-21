package XManagment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager(input);

        selectMenu(input, customerManager);
    }

    public static void selectMenu(Scanner input, CustomerManager customerManager) {
        int num = -1;
        while (num != 5) {
            try {
                showMenu();
                num = input.nextInt();

                switch (num) {
                    case 1:
                        customerManager.addCustomer();
                        break;
                    case 2:
                        customerManager.deleteCustomer();
                        break;
                    case 3:
                        customerManager.editCustomer();
                        break;
                    case 4:
                        customerManager.viewCustomers();
                        break;
                    default:
                        continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please put an integer between 1 and 5!");
                if (input.hasNext()) {
                    input.next();
                }
                num = -1;
            }
        }
    }

    public static void showMenu() {
        System.out.println("*** Customer Management System Menu ***");
        System.out.println(" 1. Add Customer");
        System.out.println(" 2. Delete Customer");
        System.out.println(" 3. Edit Customer");
        System.out.println(" 4. View Customers");
        System.out.println(" 5. Exit");
        System.out.println("Select one number between 1 - 5:");
    }
}
