package Method;

import java.util.Scanner;

public class  calculateWindChill {

 
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature 
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateWindChill calculator = new calculateWindChill();

     
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

     
        double windChill = calculator.calculateWindChill(temp, windSpeed);

   
        System.out.println("The Wind Chill Temperature is: " + windChill);

        sc.close();
    }
}
