package ass3;



	import java.util.*;

	public class numcheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	   
	        int number = sc.nextInt();
	        sc.close();

	        if (number > 0) {
	            System.out.println("positive");
	        } else if (number < 0) {
	            System.out.println("negative");
	        } else {
	            System.out.println("zero");
	        }
	    }
	}
