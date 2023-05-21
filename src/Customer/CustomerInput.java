package Customer;

import java.util.Scanner;

public interface CustomerInput {
    public void setName(String name);

    public int getId();

    public void setId(int id);

    public void setEmail(String email);

    public void setPhone(String phone);

    public void getUserInput(Scanner input);

    public void printInfo();

    public void setCustomerID(Scanner input);

    public void setCustomerName(Scanner input);

    public void setCustomerEmail(Scanner input);

    public void setCustomerPhone(Scanner input);
}
