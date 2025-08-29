package Array;
import java.util.*;

public class multi6_9 {
    public static void main(String[] args) {
        int[] table = new int[40]; 
        int index = 0;

        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                table[index++] = num * i;
                System.out.println(num + " * " + i + " = " + (num * i));
            }
            System.out.println();
        }
    }
}
