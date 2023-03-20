import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        String sentence;
        Scanner str = new Scanner(System.in);

        sentence = str.nextLine();

        System.out.println(sentence);
    }
}
