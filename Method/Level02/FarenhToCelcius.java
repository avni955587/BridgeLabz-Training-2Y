package Method;

public class FarenhToCelcius
{

  
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }


    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

  
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

   
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

   
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

   
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    
    public static void main(String[] args) {
        System.out.println("100°F in Celsius = " + convertFahrenheitToCelsius(100));
        System.out.println("0°C in Fahrenheit = " + convertCelsiusToFahrenheit(0));
        System.out.println("150 pounds in kg = " + convertPoundsToKilograms(150));
        System.out.println("70 kg in pounds = " + convertKilogramsToPounds(70));
        System.out.println("10 gallons in liters = " + convertGallonsToLiters(10));
        System.out.println("50 liters in gallons = " + convertLitersToGallons(50));
    }
}
