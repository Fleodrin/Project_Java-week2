package Third;

import java.util.HashSet;

public class WordCounter {
    public static void main(String[] args) {
        // Find a song or poem and put it in a string.
        String poem = "You did what you did to me " +
                "Now it's history, " +
                "I see Here's my comeback on the road again " +
                "Things will happen while they can " +
                "I will wait here for my man tonight " +
                "It's easy when you're big in Japan";

        // Split the poem by spaces and newline characters
        String[] words = poem.split(" ");

        // Add each word to a set
        HashSet<String> set = new HashSet<>();
        HashSet<String> lowerCaseSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);

            // Convert the word to lowercase and add it to the lowerCaseSet
            lowerCaseSet.add(words[i].toLowerCase());
        }

        // Count the number of words added to the set
        System.out.println("Number of words (case-sensitive): " + set.size());

        // Count the number of words added to the lowerCaseSet
        System.out.println("Number of words (case-insensitive): " + lowerCaseSet.size());
    }
}
