//Import scanner

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int first, second;
        String operator;

        Scanner firstValue = new Scanner(System.in);
        System.out.print("First value: ");
        first = firstValue.nextInt();

        Scanner secondValue = new Scanner(System.in);
        System.out.print("Second value: ");
        second = secondValue.nextInt();

        Scanner operatorString = new Scanner(System.in);
        System.out.print("Operator: ");
        operator = operatorString.nextLine();

        switch(operator) {
            case "+":
                System.out.print(first + second);
                break;
            case "-":
                System.out.print(first - second);
                break;
            case "/":
                if (second == 0) {
                    System.out.print("Division by zero!");
                } else {
                    System.out.print(first / second);
                }
                break;
            case "*":
                System.out.print(first * second);
                break;
            default :
                System.out.print("Something went wrong, try use a different operator");;
        }
    }
}
