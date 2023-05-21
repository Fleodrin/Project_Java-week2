package Eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }
    }
}
