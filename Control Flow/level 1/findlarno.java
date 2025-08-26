package ass3;
import java.util.*;

public class findlarno {

	public static void main(String[] args)
	{
		Scanner ar=new Scanner(System.in);
		
		int n1=ar.nextInt();
		int n2=ar.nextInt();
		int n3=ar.nextInt();
		
		boolean islarn1=(n1>n2 && n1>n3);
		boolean islarn2 =(n2>n1 && n2>n3);
		boolean islarn3 =(n3>n1 && n3>n2);
		
		System.out.println(" Is the first number the larges"+islarn1);
		System.out.println(" Is the second number the larges?"+islarn2);
		System.out.println(" Is the third number the larges?"+islarn3);
		
		ar.close();

	}

}
