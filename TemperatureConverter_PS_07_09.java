// Write a function to convert Celsius temperature into fahrenheit


public class TemperatureConverter {

    // Function to convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 37;  // Example temperature in Celsius
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}


/*
output 

37.0°C = 98.6°F

*/
