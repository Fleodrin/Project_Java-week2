package Nineth;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TextLogger {
    public static void main(String[] args) {
        saveTextToFile();
    }

    public static void saveTextToFile() {
        String filename = "log.txt";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            Scanner scanner = new Scanner(System.in);
            String sentence;

            do {
                System.out.print("Enter a sentence (or 'exit' to quit): ");
                sentence = scanner.nextLine();

                if (!sentence.equals("exit")) {
                    String currentTime = dateFormat.format(new Date());
                    String logEntry = currentTime + " " + sentence;
                    writer.println(logEntry);
                }
            } while (!sentence.equals("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
