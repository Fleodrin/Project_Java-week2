package Customer;

import java.util.Scanner;

public class DepartmentStoreCustomer extends Customer implements CustomerInput {

    public DepartmentStoreCustomer(CustomerKind kind) {
        super(kind);
    }

    public void getUserInput(Scanner input) {
        System.out.print("Customer ID:");
        int id = input.nextInt();
        this.setId(id);

        System.out.print("Customer name:");
        String name = input.next();
        this.setName(name);

        System.out.print("Email address:");
        String email = input.next();
        this.setEmail(email);

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
