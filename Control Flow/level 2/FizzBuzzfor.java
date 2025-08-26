package ass3;


	import java.util.*;

	public class FizzBuzzfor {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int number = sc.nextInt();
	        sc.close();

	     	        if (number >= 1) {
	            int i = 1;
	            while (i <= number) {
	                if (i % 3 == 0 && i % 5 == 0) {
	                    System.out.println("FizzBuzz");
	                } else if (i % 3 == 0) {
	                    System.out.println("Fizz");
	                } else if (i % 5 == 0) {
	                    System.out.println("Buzz");
	                } else {
	                    System.out.println(i);
	                }
	                i++; 
	            }
	        } else {
	            System.out.println("The number " + number + " is not a positive integer");
	        }
	    }
	}
