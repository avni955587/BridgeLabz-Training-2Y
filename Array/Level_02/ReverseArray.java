package Array2;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

     
        long temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

       
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

    
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

       
        System.out.print("\nOriginal Number: " + number);
        System.out.print("\nReversed Number: ");
        for (int d : reverseDigits) {
            System.out.print(d);
        }

        sc.close();
    }
}
