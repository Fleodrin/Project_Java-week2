package XManagment;

import java.util.Scanner;

public class CustomerManagement {
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);

        while (num != 6) {
            System.out.println(" 1. Add Customers");
            System.out.println(" 2. Delete Customers");
            System.out.println(" 3. Edit Customers");
            System.out.println(" 4. View Customers");
            System.out.println(" 5. Show a menu");
            System.out.println(" 6. Exit");
            System.out.println("Select one number between 1-6:");
            num = input.nextInt();
        }
    }
}
