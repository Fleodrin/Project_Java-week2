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
}
