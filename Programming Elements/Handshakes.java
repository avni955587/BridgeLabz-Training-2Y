package ass2;
import java.util.Scanner;

public class Handshakes {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	    
	        System.out.print("Enter the number of students: ");
	        int noOfStu = sc.nextInt();

	  
	        int handshakes = (noOfStu * (noOfStu - 1)) / 2;

	 
	        System.out.println("The maximum number of possible handshakes is " + handshakes);

	        sc.close();
	    }
	}
