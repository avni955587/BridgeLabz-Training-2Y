package String;

import java.util.Scanner;

public class CharFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] charFrequency(String text) {
        int[] freq = new int[256];  // frequency array for ASCII chars

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Step 2: Count how many unique characters exist
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Step 3: Create 2D array [uniqueCount][2]
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Step 4: Fill the 2D array with char + frequency
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // only add the character the first time it appears
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                index++;

                freq[c] = 0; // reset to avoid duplication
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] frequencies = charFrequency(text);

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " -> " + frequencies[i][1]);
        }
        sc.close();
    }
}
