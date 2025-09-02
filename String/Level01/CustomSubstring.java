package String;

import java.util.Scanner;

public class CustomSubstring {
    // Method to create substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = customSubstring(str, start, end);
        String sub2 = str.substring(start, end);

        System.out.println("Custom substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Both substrings are equal? " + sub1.equals(sub2));
    }
}
