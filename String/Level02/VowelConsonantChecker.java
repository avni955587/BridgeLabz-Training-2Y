package String;

import java.util.Scanner;

public class VowelConsonantChecker {

 
    public static String checkCharType(char ch) {
       
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); 
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

   
    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);   
            result[i][1] = checkCharType(ch);   
        }
        return result;
    }

   
    public static void displayResult(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("   " + data[i][0] + "\t\t" + data[i][1]);
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        String[][] result = analyzeString(input);

        
        displayResult(result);

        sc.close();
    }
}
