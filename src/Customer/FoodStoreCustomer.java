package Customer;

import java.util.Scanner;

public class FoodStoreCustomer extends ConvenienceStoreCustomer {
    public FoodStoreCustomer(CustomerKind kind) {
        super(kind);
    }

    public void getUserInput(Scanner input) {
        setCustomerID(input);
        setCustomerName(input);
        setCustomerEmailwithYN(input);
        setCustomerPhone(input);
    }
}
