package String;

import java.util.Scanner;

public class WordLengthTable {

   
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
        String[] temp = new String[n]; 
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else if (!currentWord.equals("")) {
                temp[wordCount++] = currentWord;
                currentWord = "";
            }
        }
        if (!currentWord.equals("")) {
            temp[wordCount++] = currentWord;
        }

       
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = temp[i];
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

    
    public static void displayTable(String[][] wordData) {
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (int i = 0; i < wordData.length; i++) {
            
            int len = Integer.parseInt(wordData[i][1]);
            System.out.println(wordData[i][0] + "\t\t" + len);
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

       
        String[] words = customSplit(input);

        
        String[][] wordData = createWordLengthArray(words);

        
        displayTable(wordData);

        sc.close();
    }
}
