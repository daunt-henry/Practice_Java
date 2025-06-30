// Write a program to sum first n even numbers using while loop.

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for how many even numbers to sum
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int i = 0;           // Counter for even numbers (starting from 0)
        int count = 0;       // Count how many even numbers added
        int sum = 0;         // To store the sum

        while (count < n) {
            sum += i;
            i += 2;          // Move to the next even number
            count++;
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);

        scanner.close();
    }
}

/*

output 

Enter the value of n: 5
Sum of first 5 even numbers is: 20

*/
