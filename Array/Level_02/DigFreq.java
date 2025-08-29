package Array2;

import java.util.*;

public class DigFreq{
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

        int[] frequency = new int[10];
        for (int d : digits) {
            frequency[d]++;
        }

 
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { 
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
