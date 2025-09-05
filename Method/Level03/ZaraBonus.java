package Method;
import java.util.Scanner;

public class ZaraBonus {

    // Method to take input for salaries & years of service
    public static int[][] inputEmployeeData(int numEmployees) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[numEmployees][2]; // [salary, yearsOfService]

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Salary: ");
            data[i][0] = sc.nextInt(); // salary
            System.out.print("Years of Service: ");
            data[i][1] = sc.nextInt(); // years of service
        }

        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2]; // [bonus, newSalary]

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05; // 5%
            } else {
                bonus = salary * 0.02; // 2%
            }

            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to calculate totals & display results
    public static void displayResults(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-12s %-10s %-12s %-12s %-12s\n",
                "EmpID", "OldSalary", "Years", "Bonus", "NewSalary", "Remarks");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            String remarks = (years > 5) ? "5% Bonus" : "2% Bonus";

            System.out.printf("%-10d %-12d %-10d %-12.2f %-12.2f %-12s\n",
                    (i + 1), salary, years, bonus, newSalary, remarks);
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-10s %-12.2f %-12.2f\n",
                "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    // Main method
    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Input employee data
        int[][] employeeData = inputEmployeeData(numEmployees);

        // Step 2: Calculate bonus and new salary
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display results
        displayResults(employeeData, bonusData);
    }
}
