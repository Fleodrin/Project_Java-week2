package Customer;

import java.util.Scanner;

public class FoodStoreCustomer extends Customer {

    public FoodStoreCustomer(CustomerKind kind) {
        super(kind);
    }
    public void getUserInput(Scanner input) {
        System.out.print("Customer ID:");
        int id = input.nextInt();
        this.setId(id);

        System.out.print("Customer name:");
        String name = input.next();
        this.setName(name);

        char answer = 'x';
        while (answer != 'Y' && answer != 'N') {
            System.out.print("Do you have an email address? (Y/N)");
            answer = input.next().charAt(0);
            answer = Character.toUpperCase(answer);

            if (answer == 'Y') {
                System.out.print("Email address:");
                String email = input.next();
                this.setEmail(email);
                break;
            } else if (answer == 'N') {
                this.setEmail("");
                break;
            } else {

            }
        }

        System.out.print("Phone number:");
        String phone = input.next();
        this.setPhone(phone);
    }
}
