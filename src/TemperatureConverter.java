//Import scanner

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        float temp;

        //Define scanner with the float input value
        System.out.print("Temperature in the Fahrenheit: ");

        Scanner input = new Scanner(System.in);

        temp = input.nextFloat();

        //We use "." because we should show the program that we use float numbers
        System.out.println(5. / 9 * (temp - 32));
    }
}
