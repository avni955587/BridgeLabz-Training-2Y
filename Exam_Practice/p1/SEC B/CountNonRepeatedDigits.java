
import java.util.*;
public class CountNonRepeatedDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] f=new int[10];
        for(char ch:s.toCharArray()) f[ch-'0']++;
        int c=0;
        for(int x:f) if(x==1) c++;
        System.out.println(c);
        sc.close();
    }
}
