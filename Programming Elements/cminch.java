package ass2;

import java.util.*;
public class cminch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Height in CM:");
		int h=sc.nextInt();
		double totinch=(int)h/2.54;
		double foot=(int)totinch/12;
		double inch=(int)totinch%12;
		sc.close();
		System.out.println("Your Height in cm is "+h+" while in feet is "+foot+" and inches is "+inch);
				
	}

}
