
import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sc.close();         
        int n=sc.nextInt();
        if(n<=1){ 
            
            System.out.println(n);
             return; 
            }
        long a=0,b=1;
        for(int i=2;i<=n;i++){
            long t=a+b;
            a=b; b=t;
        }
        System.out.println(b);
        
    }
}
