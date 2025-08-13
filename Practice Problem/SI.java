package AV;
import java.util.*;

public class SI {

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
		
	    System.out.print("principal amount : ");
		int p = sc.nextInt();
		
	    System.out.print("rate of interest : ");
			int r = sc.nextInt();
			
		 System.out.print("timeperiod : ");
			int t = sc.nextInt();
			
		int si=(p*r*t)/100;
		
		 System.out.print("Simple Interest : " + si);
		
			


	}

}
