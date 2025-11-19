
import java.util.*;
public class NthPrime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int count=0,num=1;
        while(count<n){
            num++;
            if(isPrime(num)) count++;
        }
        System.out.println(num);
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0) return false;
        return true;
        
    }
}
