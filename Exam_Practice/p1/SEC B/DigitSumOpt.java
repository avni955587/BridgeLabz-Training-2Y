
import java.util.*;
public class DigitSumOpt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String type=sc.next(); // even / odd
        int sum=0;
        while(n!=0){
            int d=(int)(n%10);
            if(type.equalsIgnoreCase("even") && d%2==0) sum+=d;
            if(type.equalsIgnoreCase("odd") && d%2!=0) sum+=d;
            n/=10;
        }
        System.out.println(sum);
        sc.close(); 
    }
}
