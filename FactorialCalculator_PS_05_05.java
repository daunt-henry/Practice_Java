// Write a program to find factorial of a given number using for loops.


import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        long factorial = 1; // Use long to handle large results

        // Calculate factorial using for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}

/*
output 

Enter a number to find its factorial: 5
Factorial of 5 is: 120

*/
