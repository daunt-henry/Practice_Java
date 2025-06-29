// Write a Java program to convert kilometers to miles


import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Conversion factor: 1 kilometer = 0.621371 miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        scanner.close();
    }
}

/*
Output 

Enter distance in kilometers: 10
10.0 kilometers is equal to 6.21371 miles.

*/
