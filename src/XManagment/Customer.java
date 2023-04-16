package XManagment;

public class Customer {
    String name;
    int id;
    String email;
    String phone;

    public Customer() {
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

    public void printInfo() {
        System.out.println("name:" + name + " id:" + id + " email:" + email + " phone:" + phone);
    }
}
