package ass3;



	import java.util.*;

	public class Factors {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);


	        int number = sc.nextInt();
	        sc.close();

	
	        if (number > 0) {
	            System.out.println("Factors of " + number + " are:");
	            for (int i = 1; i <= number; i++) {
	                if (number % i == 0) {
	                    System.out.println(i);
	                }
	            }
	        } else {
	            System.out.println("The number " + number + " is not a positive integer");
	        }
	    }
	}
