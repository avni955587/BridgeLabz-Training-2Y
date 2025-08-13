package AV;

import java.util.*;

public class powercalc {

	public static void main(String[] args) {
		Scanner ar =new Scanner(System.in);
		
	    System.out.print("enter the Base: ");
		int b = ar.nextInt();
		
		System.out.print("enter the Exponent : ");
		int e = ar.nextInt();
		
		double res= Math.pow(b, e);
		
		System.out.print(b + " raised to the power of " + e + " is: " + res);

		
		

	}

}
