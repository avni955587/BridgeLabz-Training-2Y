package ass3;
import java.util.*;

public class nodivby5 {

	public static void main(String[] args) 
	{
		Scanner ar=new Scanner(System.in);
		int num=ar.nextInt();
		
	    boolean isDivisible=(num%5==0);
	    ar.close();
	    
	    System.out.println("Is the number " + num + " divisible by 5? " + isDivisible);
	}

}
