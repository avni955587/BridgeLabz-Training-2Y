package ass3;


	import java.util.*;

	public class mul_table {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int number = sc.nextInt();
	        sc.close();

	        
	        for (int i = 6; i <= 9; i++) {
	            System.out.println(number + " * " + i + " = " + (number * i));
	        }
	    }
	}
