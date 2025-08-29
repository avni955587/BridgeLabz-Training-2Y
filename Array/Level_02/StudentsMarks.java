package Array2;

import java.util.*;

public class StudentsMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

     
        int[][] marks = new int[number][3]; 
        double[] percentage = new double[number];
        String[] grade = new String[number];

     
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1 ? "Chemistry" : "Maths");

              
                while (true) {
                    System.out.print("Enter marks in " + subject + " (0-100): ");
                    int mark = sc.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("❌ Invalid input! Marks must be between 0 and 100.");
                    }
                }
            }
        }

     
        for (int i = 0; i < number; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 40) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

       
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d | Percentage: %.2f%% | Grade: %s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}
