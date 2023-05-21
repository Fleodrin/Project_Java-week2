package Customer;

import java.util.Scanner;

import Exception.EmailFormatException;

public abstract class ConvenienceStoreCustomer extends Customer {

    public ConvenienceStoreCustomer(CustomerKind kind) {
        super(kind);
    }

    public abstract void getUserInput(Scanner input);

    public void printInfo() {
        String skind = getKindString();
        System.out.println("kind:" + skind + " name:" + name + " id:" + id + " email:" + email + " phone:" + phone);
    }

    public void setCustomerEmailwithYN(Scanner input) {
        char answer = 'x';
        while (answer != 'Y' && answer != 'N') {
            System.out.print("Do you have an email address? (Y/N)");
            answer = input.next().charAt(0);
            answer = Character.toUpperCase(answer);

            try {
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
            } catch (EmailFormatException e) {
                System.out.println("Incorrect Email Format. Put the e-mail adress that contains @");
            }
        }
    }
}
