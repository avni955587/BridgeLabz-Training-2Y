package Array2;

import java.util.*;

public class BMICalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();
            System.out.print("Weight (in kg): ");
            weight[i] = sc.nextDouble();
        }

   
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2fm, Weight: %.2fkg, BMI: %.2f, Status: %s%n",
                    (i + 1), height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
