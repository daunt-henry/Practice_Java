// Write a function to print nth term of fibonacci series using recursion.

import java.util.Scanner;

public class FibonacciRecursive {

    // Recursive function to return nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 1) return 0; // 1st term
        if (n == 2) return 1; // 2nd term
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Call the recursive function
        int result = fibonacci(n);

        // Print result
        System.out.println("The " + n + "th term of the Fibonacci series is: " + result);

        scanner.close();
    }
}


/*
output 

Enter the value of n: 6
The 6th term of the Fibonacci series is: 5

*/
