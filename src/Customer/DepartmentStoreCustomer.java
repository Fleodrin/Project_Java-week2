package Customer;

import java.util.Scanner;

public class DepartmentStoreCustomer extends Customer {

    public DepartmentStoreCustomer(CustomerKind kind) {
        super(kind);
    }

    public void getUserInput(Scanner input) {
        setCustomerID(input);
        setCustomerName(input);
        setCustomerEmail(input);
        setCustomerPhone(input);
    }

    public void printInfo() {
        String skind = getKindString();
        System.out.println("kind:" + skind + " name:" + name + " id:" + id + " email:" + email + " phone:" + phone);
    }
}
