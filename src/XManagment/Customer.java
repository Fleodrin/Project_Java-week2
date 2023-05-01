package XManagment;

public class Customer {
    protected CustomerKind kind = CustomerKind.DepartmentStore;
    protected String name;
    protected int id;
    protected String email;
    protected String phone;

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
