package String;

import java.util.Scanner;

public class WordLengthFinder {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return count;
    }

   
    public static String[] customSplit(String text) {
        int n = findLength(text);
        String[] words = new String[n]; 
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else if (!currentWord.equals("")) {
                words[wordCount++] = currentWord;
                currentWord = "";
            }
        }
        if (!currentWord.equals("")) {
            words[wordCount++] = currentWord; 
        }

        
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }

    
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordData;
    }

    
    public static int[] findShortestAndLongest(String[][] wordData) {
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            int minLength = Integer.parseInt(wordData[minIndex][1]);
            int maxLength = Integer.parseInt(wordData[maxIndex][1]);

            if (length < minLength) {
                minIndex = i;
            }
            if (length > maxLength) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        
        String[] words = customSplit(input);

        
        String[][] wordData = createWordLengthArray(words);

        
        int[] result = findShortestAndLongest(wordData);

        
        System.out.println("\nWord\tLength");
        System.out.println("------------------");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t" + wordData[i][1]);
        }

        System.out.println("\nShortest word: " + wordData[result[0]][0] + " (Length: " + wordData[result[0]][1] + ")");
        System.out.println("Longest word: " + wordData[result[1]][0] + " (Length: " + wordData[result[1]][1] + ")");

        sc.close();
    }
}

