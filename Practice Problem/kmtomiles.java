package AV;

import java.util.*;

public class kmtomiles {

	public static void main(String[] args) {
		   Scanner ar =new Scanner (System.in);
		   
		   System.out.print("enter the kms : ");
		   int km=ar.nextInt();
		   
		   float miles =(float)(km * 0.621371);
		   
		   System.out.print(" MILES : " + miles);

	}

}
