package AV;

import java.util.*;
public class volofcylinder {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
		
	    System.out.print("enter the radius of cylinder : ");
		int r = sc.nextInt();
		
		System.out.print("enter the height of cylinder : ");
		int h = sc.nextInt();
		
		float vol= (float) (3.14*r*r*h);

	    System.out.print("Volume of cylinder: "+vol +" cm cube");
	

	}

}
