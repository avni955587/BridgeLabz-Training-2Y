package Array2;

import java.util.*;

public class BMICALC2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; 
        String[] weightStatus = new String[n];   

   
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            do {
                System.out.print("Height (in meters): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("❌ Height must be positive. Try again.");
                }
            } while (personData[i][0] <= 0);

          
            do {
                System.out.print("Weight (in kg): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("❌ Weight must be positive. Try again.");
                }
            } while (personData[i][1] <= 0);
        }

    
        for (int i = 0; i < n; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            personData[i][2] = weight / (height * height); // BMI formula
            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

     
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2fm, Weight: %.2fkg, BMI: %.2f, Status: %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
