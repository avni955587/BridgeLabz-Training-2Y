package AV;
import java.util.*;

public class celtofranh 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("enter the temp in celcius : ");
		float tem=sc.nextFloat();
		
		float franh=(tem  * 9/5) + 32;
		System.out.print("Temperature in Fahrenheit: "+franh);
			
	}

}
