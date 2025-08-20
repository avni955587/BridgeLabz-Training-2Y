package ass2;

import java.util.*;
public class Kilotomiles {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the KM:");
		double km=sc.nextDouble();
		double miles=km/1.6;
		sc.close();
		System.out.println("The total miles is "+miles+" mile for the given "+km+ " km");
		
	}

}
