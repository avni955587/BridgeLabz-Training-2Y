package Method;

import java.util.Scanner;

public class BMICalculator {

 
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; 
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; 
        }
    }

    
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        double[][] members = new double[10][3];

        
        System.out.println("Enter weight (kg) and height (cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            members[i][0] = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            members[i][1] = sc.nextDouble();
        }

      
        calculateBMI(members);

        
        String[] statuses = determineBMIStatus(members);

      
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < members.length; i++) {
            System.out.printf("%-10.1f %-10.1f %-10.2f %-15s\n",
                    members[i][0], members[i][1], members[i][2], statuses[i]);
        }

        sc.close();
    }
}

