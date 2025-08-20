package ass2;
import java.util.Scanner;

public class querem {



	    public static void main(String[] args) {
	        Scanner ar = new Scanner(System.in);

	     
	        System.out.print("Enter first number: ");
	        int a = ar.nextInt();

	        System.out.print("Enter second number: ");
	        int b = ar.nextInt();

	      
	        int q = a / b;
	        int r = a % b;

	  
	        System.out.println("The Quotient is " + q + " and Remainder is " + r +
	                           " of two numbers " + a + " and " + b);

	        ar.close();
	    }
	}
