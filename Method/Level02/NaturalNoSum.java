package Method;

import java.util.Scanner;

public class NaturalNoSum {

   
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

  
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a natural number (n > 0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
        } else {
           
            int recursiveResult = recursiveSum(n);

          
            int formulaResult = formulaSum(n);

          
            System.out.println("Sum of first " + n + " natural numbers (recursive) = " + recursiveResult);
            System.out.println("Sum of first " + n + " natural numbers (formula)   = " + formulaResult);

           
            if (recursiveResult == formulaResult) {
                System.out.println("✅ Both methods give the same result.");
            } else {
                System.out.println("❌ Results do not match!");
            }
        }

        sc.close();
    }
}

