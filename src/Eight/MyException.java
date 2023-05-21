package Eight;

import java.util.Scanner;

class MyException extends Exception {
    public MyException() {
        super("OddNumberException: Entered number is odd.");
    }

    public static void main(String[] args) {
        try {
            int number = getInputNumber();
            if (number % 2 != 0) {
                throw new MyException();
            } else {
                System.out.println("Entered number is even.");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
}
