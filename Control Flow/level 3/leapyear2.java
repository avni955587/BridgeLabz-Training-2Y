package ass3;



	import java.util.*;

	public class leapyear2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        int year = sc.nextInt();
	        sc.close();

	 
	        if (year < 1582) {
	            System.out.println("Year " + year + " is not valid (Gregorian calendar starts from 1582).");
	        } else {
	            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	                System.out.println("Year " + year + " is a Leap Year.");
	            } else {
	                System.out.println("Year " + year + " is not a Leap Year.");
	            }
	        }
	    }
	}
