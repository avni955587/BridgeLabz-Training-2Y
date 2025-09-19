package thisfinal;

class Student {
  
    private static String universityName = "National Institute of Technology";
    private static int totalStudents = 0;

   
    private final int rollNumber;

    private String name;
    private String grade;

   
    Student(String name, int rollNumber, String grade) {
        this.name = name;            
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;              
    }

  
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }


    public void displayStudentDetails() {
        System.out.println("University : " + universityName);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("Grade      : " + grade);
        System.out.println("-------------------------------");
    }

  
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated for Roll No. " + rollNumber + " to: " + grade);
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
   
        Student student1 = new Student("Avni", 101, "A");
        Student student2 = new Student("Rahul", 102, "B");

       
        if (student1 instanceof Student) {
            student1.displayStudentDetails();
        }

        if (student2 instanceof Student) {
            student2.displayStudentDetails();
        }


        if (student2 instanceof Student) {
            student2.updateGrade("A+");
        }

     
        if (student2 instanceof Student) {
            student2.displayStudentDetails();
        }

      
        Student.displayTotalStudents();

       
        System.out.println("Unique Roll Number of Student1: " + student1.getRollNumber());
    }
}
