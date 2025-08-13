package AV;

import java.util.Scanner;

public class paraofrect {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
	    System.out.print("enter the length: ");
		int l = sc.nextInt();
		
		System.out.print("enter the width : ");
		int b = sc.nextInt();
		
		int parameter=2*(l+b);
		
		System.out.print(":The parameter is " + parameter);

	}

}
