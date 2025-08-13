package AV;
import java.util.*;

public class areaofcircle 
{

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
		
	    System.out.print("enter the radius of circle : ");
		int r = sc.nextInt();
		
		float ar= (float) (3.14*r*r);

	    System.out.print("Area of circle : "+ar +" cm sq");
	 }

}
