// Write a recursive function to calculate sum of first n natural numbers


import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive function to calculate sum of first n natural numbers
    static int sum(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n + sum(n - 1); // Recursive step
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Call the recursive function
        int result = sum(n);

        // Print the result
        System.out.println("Sum of first " + n + " natural numbers is: " + result);

        scanner.close();
    }
}


/*

output 

Enter a number: 5
Sum of first 5 natural numbers is: 15

*/
