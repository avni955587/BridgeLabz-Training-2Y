package ass2;

public class profitpercent{
	public static void main(String [] args) 
   {
	   int cp=129;
	   int sp=191;
	   
	   System.out.println("The Cost Price is INR" + cp +" and Selling Price is INR "+sp);
	   
	   int pro=sp-cp;
	   double pp=(pro*100)/cp;
	   
	   System.out.print("The Profit is INR "+ pro+" and the Profit Percentage is "+pp);
	   
   }
}
