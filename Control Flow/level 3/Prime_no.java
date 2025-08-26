package ass3;



	import java.util.*;

	public class Prime_no {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);


	        int number = sc.nextInt();
	        sc.close();

	   
	        boolean isPrime = true;

	     
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	          
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break; 
	                }
	            }
	        }


	        if (isPrime) {
	            System.out.println(number + " is a Prime Number.");
	        } else {
	            System.out.println(number + " is not a Prime Number.");
	        }
	    }
	}
