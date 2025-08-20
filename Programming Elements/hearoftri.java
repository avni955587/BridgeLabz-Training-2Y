package ass2;
import java.util.*;

public class hearoftri {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter the base of the triangle (in inches): ");
	        double base = sc.nextDouble();

	        System.out.print("Enter the height of the triangle (in inches): ");
	        double heightInInches = sc.nextDouble();

	       
	        double areaInSqInches = 0.5 * base * heightInInches;
	        double areaInSqCm = areaInSqInches * 6.4516; 

	   
	        double heightInCm = heightInInches * 2.54;   
	        double heightInFeet = heightInInches / 12;   


	        
	        System.out.println("Your Height in cm is " + heightInCm 
	                           + " while in feet is " + heightInFeet 
	                           + " and inches is " + heightInInches);

	        sc.close();
	}

}
