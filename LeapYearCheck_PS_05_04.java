// Write a Java program to find whether a year is a leap year 


import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check for leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}


/*
output 
case 1
Enter a year: 2024
2024 is a Leap Year.

case 2
Enter a year: 2100
2100 is NOT a Leap Year.

*/
