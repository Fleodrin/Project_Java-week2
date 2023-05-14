package Customer;

import java.util.Scanner;

public class ElectronicStoreCustomer extends Customer implements CustomerInput {

    protected String securedEmail;

    public ElectronicStoreCustomer(CustomerKind kind) {
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

        answer = 'x';
        while (answer != 'Y' && answer != 'N') {
            System.out.print("Do you have a secured email address? (Y/N)");
            answer = input.next().charAt(0);
            answer = Character.toUpperCase(answer);

            if (answer == 'Y') {
                System.out.print("Secured email address:");
                securedEmail = input.next();
                this.setEmail(securedEmail);
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

    public void printInfo() {
        String skind = "none";
        switch (this.kind) {
            case DepartmentStore:
                skind = "Dep.Store";
                break;
            case FoodStore:
                skind = "FoodStore";
                break;
            case ElectronicStore:
                skind = "EStore";
                break;
            case ConvenientStore:
                skind = "Conv.Store";
                break;
            default:
        }
        System.out.println("kind:" + skind + " name:" + name + " id:" + id + " email:" + email + " phone:" + phone);
    }
}
