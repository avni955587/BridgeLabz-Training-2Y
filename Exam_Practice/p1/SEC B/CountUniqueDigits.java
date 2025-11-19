
import java.util.*;
public class CountUniqueDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()) set.add(ch);
        System.out.println(set.size());
        sc.close();
    }
}
