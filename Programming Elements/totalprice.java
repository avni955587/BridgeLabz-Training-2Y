package ass2;

import java.util.Scanner;

public class totalprice {

	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity: ");
        int quan = sc.nextInt();

  
        double totalPrice = unitPrice * quan;

    
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quan +
                           " and unit price is INR " + unitPrice);
        
        sc.close();

	}

}
