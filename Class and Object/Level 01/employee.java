package class_object;

public class employee{
    int id;
    String name;
    double salary;

    public static void main(String[] args) {
        employee Employee = new employee();
        Employee.id = 50;
        Employee.name = "Avni";
        Employee.salary = 10000000;
        Employee.printemployee(Employee.id,Employee.name,Employee.salary);
    }

    public void printemployee(int id,String name, double salary){
        System.err.println("The employee's id is:"+id);
        System.err.println("The employee's name is:"+name);
        System.out.println("The employee's salary is:"+salary);
    }
}