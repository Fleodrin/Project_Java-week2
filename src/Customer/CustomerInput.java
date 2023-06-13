package Customer;

import java.util.Scanner;
import Exception.EmailFormatException;

public interface CustomerInput {
    public void setName(String name);

    public String getName();

    public int getId();

    public void setId(int id);

    public void setEmail(String email) throws EmailFormatException;

    public String getEmail();

    public void setPhone(String phone);

    public String getPhone();

    public void getUserInput(Scanner input);

    public void printInfo();

    public void setCustomerID(Scanner input);

    public void setCustomerName(Scanner input);

    public void setCustomerEmail(Scanner input);

    public void setCustomerPhone(Scanner input);
}
