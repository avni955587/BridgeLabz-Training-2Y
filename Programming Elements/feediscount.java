package ass2;

import java.util.*;
public class feediscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fee=sc.nextInt();
		int disper=sc.nextInt();
		sc.close();
		int discount;
		discount=(fee*disper)/100;
		int netFee=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+netFee);
	}

}
