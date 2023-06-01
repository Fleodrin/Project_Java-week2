package XManagment;

import Log.EventLogger;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerManagement {
    static EventLogger logger = new EventLogger("log.txt");

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CustomerManager customerManager = getObject("customermanager.ser");
        if (customerManager == null) {
            customerManager = new CustomerManager(input);
        }

        selectMenu(input, customerManager);
        putObject(customerManager, "customermanager.ser");
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
                        logger.log("add a student");
                        break;
                    case 2:
                        customerManager.deleteCustomer();
                        logger.log("delete a student");
                        break;
                    case 3:
                        customerManager.editCustomer();
                        logger.log("edit a student");
                        break;
                    case 4:
                        customerManager.viewCustomers();
                        logger.log("edit a list of students");
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

    public static CustomerManager getObject(String filename) {
        CustomerManager customerManager = null;


        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            customerManager = (CustomerManager) in.readObject();

            in.close();
            file.close();
        } catch (FileNotFoundException e) {
            return customerManager;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customerManager;
    }

    public static void putObject(CustomerManager customerManager, String filename) {
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(customerManager);

            out.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
