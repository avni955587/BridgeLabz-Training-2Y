package ass3;
import java.util.*;

public class smallof3num {

	public static void main(String[] args) 
	{
		Scanner ar=new Scanner(System.in);
	
		int n1=ar.nextInt();
		 int n2=ar.nextInt();
		int n3=ar.nextInt();
		
		ar.close();
		
		boolean isSmall=(n1<n2 && n1<n3);
		
		System.out.println(" Is the first number the smallest?"+isSmall);
	}
}
