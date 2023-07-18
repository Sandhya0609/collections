package map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class LetterOccurrencesHashMap {
        public static void main(String[] args) {
            String inputString = "this is your first round this is not a final round ";

            Map<Character, Integer> letterCounts = new HashMap<>();

            // Remove non-letter characters and convert the string to lowercase
            //inputString = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();
/*
we iterate through each character of the string and check if it is a letter using Character.isLetter(c). If it is,
we update the letterCounts map by putting the letter and its corresponding count (incremented by 1).
 */
            // Count the occurrences of each letter
            for (char c : inputString.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
                }
            }

            // Display the occurrences of each letter
            for (char c : letterCounts.keySet()) {
                int count = letterCounts.get(c);
                System.out.println("Number of occurrences of letter '" + c + "' is : "  + count );
            }
        }
    }
