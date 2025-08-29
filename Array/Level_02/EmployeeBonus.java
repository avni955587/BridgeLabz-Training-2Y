package Array2;

import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 10;  
        double[] salary = new double[N];
        double[] years = new double[N];
        double[] bonus = new double[N];
        double[] newSalary = new double[N];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

  
        for (int i = 0; i < N; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

          
            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--; 
                continue;
            }

         
            System.out.print("Enter years of service: ");
            double yrs = sc.nextDouble();
            if (yrs < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--; 
                continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }


        for (int i = 0; i < N; i++) {
            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i]; 
            } else {
                bonus[i] = 0.02 * salary[i]; 
                }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        System.out.println("\n--- Company Zara Salary & Bonus Report ---");
        for (int i = 0; i < N; i++) {
            System.out.printf("Employee %d -> Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
