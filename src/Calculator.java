//Import scanner

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int first, second;
        String operator;

        //Defining scanners and read inputs
        Scanner firstValue = new Scanner(System.in);
        System.out.print("First value: ");
        first = firstValue.nextInt();

        Scanner secondValue = new Scanner(System.in);
        System.out.print("Second value: ");
        second = secondValue.nextInt();

        Scanner operatorString = new Scanner(System.in);
        System.out.print("Operator: ");
        operator = operatorString.nextLine();

        //Use switch case for multiple actions
        switch(operator) {
            case "+":
                System.out.print(first + second);
                break;
            case "-":
                System.out.print(first - second);
                break;
            case "/":
                //Check for a "0" division
                if (second == 0) {
                    System.out.print("Division by zero!");
                } else {
                    System.out.print(first / second);
                }
                break;
            case "*":
                System.out.print(first * second);
                break;
            //Don't forget to use the default statement
            default :
                System.out.print("Something went wrong, try use a different operator");;
        }
    }
}
