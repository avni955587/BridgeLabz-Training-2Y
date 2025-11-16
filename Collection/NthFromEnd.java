package Collection;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        
        int fast = 0, slow = 0;
        
   
        while (fast < n) {
            fast++;
        }

       
        while (fast < list.size()) {
            fast++;
            slow++;
        }

        System.out.println(list.get(slow)); 
    }
}

