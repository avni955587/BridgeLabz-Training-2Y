package Method;

import java.util.Arrays;

import java.util.Scanner;

public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // digits 0-9
        for (int d : digits) {
            freq[d]++;
        }

        // Count how many digits appeared
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        // Fill 2D array [digit, frequency]
        int[][] result = new int[count][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\nNumber: " + number);
        System.out.println("Digit Count: " + countDigits(number));

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number));

        int[][] freqArray = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : freqArray) {
            System.out.println("Digit " + row[0] + " → " + row[1] + " times");
        }

        sc.close();
    }
}
