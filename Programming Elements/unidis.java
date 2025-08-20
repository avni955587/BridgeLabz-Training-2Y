package ass2;

public class unidis {

	public static void main(String[] args)
	{
		int fee=125000,disper=10,discount;
		discount=(125000*disper)/100;
		int netFee=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+netFee);
		
	}

}
