
import java.util.*;
public class PrimesInRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sc.close();  
        int l=sc.nextInt(), r=sc.nextInt();
        int c=0;
        for(int i=l;i<=r;i++)
            if(isPrime(i)) c++;
        System.out.println(c);
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0) return false;
        return true;
    }
}
