package ass3;



	import java.util.*;

	public class EmployeeBonus {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        double salary = sc.nextDouble();

	    
	        int years = sc.nextInt();
	        sc.close();

	        double bonus = 0;

	        if (years > 5) {
	            bonus = 0.05 * salary;
	        }

	        System.out.println("Bonus amount = " + bonus);
	    }
	}
