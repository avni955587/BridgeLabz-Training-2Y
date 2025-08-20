package ass2;
import java.util.Scanner;

public class disconvertor {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	    
	        System.out.print("Enter the distance in feet: ");
	        double disInFeet = sc.nextDouble();

	     
	        double disInYards = disInFeet / 3;         
	        double disInMiles = disInYards / 1760;     

	      
	        System.out.println("The distance of " + disInFeet + " feet is equal to " 
	                           + disInYards + " yards and " 
	                           + disInMiles + " miles.");

	        sc.close();

	}

}
