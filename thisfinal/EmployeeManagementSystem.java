package thisfinal;

class Employee {
  
    private static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;


    private final int id;

    private String name;
    private String designation;

    
    Employee(String name, int id, String designation) {
        this.name = name;              
        this.id = id;                 
        this.designation = designation;
        totalEmployees++;              
    }

  
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("Company    : " + companyName);
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Designation: " + designation);
        System.out.println("------------------------------");
    }

  
    public int getId() {
        return id;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
 
        Employee emp1 = new Employee("Avni", 101, "Software Engineer");
        Employee emp2 = new Employee("Rahul", 102, "Data Analyst");

       
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }

       
        Employee.displayTotalEmployees();

      
        System.out.println("Unique Employee ID of emp1: " + emp1.getId());
    }
}

