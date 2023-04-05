package Third;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 2);
        String result = randomNum == 0 ? "H" : "T";

        Scanner scanner = new Scanner(System.in);
        System.out.print("H or T: ");
        String userAnswer = scanner.nextLine();

        if (userAnswer.equals(result)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
