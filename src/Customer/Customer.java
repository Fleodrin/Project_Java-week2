package Customer;

import java.util.Scanner;

public class Customer {
    protected CustomerKind kind = CustomerKind.DepartmentStore;
    protected String name;
    protected int id;
    protected String email;
    protected String phone;

    public Customer() {
    }

    public Customer(CustomerKind kind) {
        this.kind = kind;
    }

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Customer(String name, int id, String email, String phone) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public Customer(CustomerKind kind, String name, int id, String email, String phone) {
        this.kind = kind;
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public CustomerKind getKind() {
        return kind;
    }

    public void setKind(CustomerKind kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printInfo() {
        String skind = "none";
        switch (this.kind) {
            case DepartmentStore:
                skind = "Dep. Store";
                break;
            case FoodStore:
                skind = "Food Store";
                break;
            case ElectronicStore:
                skind = "EStore";
                break;
            case ConvenientStore:
                skind = "Conv. Store";
                break;
            default:
        }
        System.out.println("kind:" + skind + " name:" + name + " id:" + id + " email:" + email + " phone:" + phone);
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
}
