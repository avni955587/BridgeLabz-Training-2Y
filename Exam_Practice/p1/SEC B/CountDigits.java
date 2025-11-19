
import java.util.*;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int c=0;
        while(n!=0){ c++; n/=10; }
        System.out.println(c);
        sc.close();
    }
}
