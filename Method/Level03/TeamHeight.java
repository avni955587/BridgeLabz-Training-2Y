package Method;

import java.util.Random;

public class TeamHeight {

    // Method to find sum of elements in array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

       public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }


    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

  
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();

       
        int[] heights = new int[11];

      
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }

       
        System.out.println("Heights of players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("\n");

       
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);
        System.out.println("Shortest player height: " + shortest + " cm");
        System.out.println("Tallest player height: " + tallest + " cm");
    }
}
