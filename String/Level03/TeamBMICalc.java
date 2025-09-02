package String;

import java.util.Scanner;

public class TeamBMICalc {

  
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
            String.valueOf(weight),          
            String.valueOf(heightCm),        
            String.format("%.2f", bmi),      
            status                           
        };
    }

   
    public static String[][] computeAllBMI(double[][] members) {
        String[][] result = new String[members.length][4];
        for (int i = 0; i < members.length; i++) {
            result[i] = calculateBMI(members[i][0], members[i][1]);
        }
        return result;
    }

  
    public static void displayTable(String[][] data) {
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" 
                    + data[i][0] + "\t\t" 
                    + data[i][1] + "\t\t" 
                    + data[i][2] + "\t\t" 
                    + data[i][3]);
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][2]; 

       
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            members[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            members[i][1] = sc.nextDouble();
        }

       
        String[][] results = computeAllBMI(members);

       
        displayTable(results);

        sc.close();
    }
}
