//Import scanner

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        String sentence;

        Scanner str = new Scanner(System.in);

        sentence = str.nextLine();

        //Print the sentence
        System.out.println(sentence);
    }
}
