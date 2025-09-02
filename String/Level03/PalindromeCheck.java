package String;

import java.util.Scanner;

public class PalindromeCheck {

  
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    
    public static String reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return new String(reversed);
    }

   
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text).toCharArray();

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Checking Palindrome with 3 logics...\n");

       
        System.out.println("Logic 1 (Iterative): " +
                (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));

      
        System.out.println("Logic 2 (Recursive): " +
                (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));

     
        System.out.println("Logic 3 (Array Compare): " +
                (isPalindromeArray(text) ? "Palindrome" : "Not Palindrome"));
        sc.close();
    }
}
