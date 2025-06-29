// Use comparison operators to find out whether a given number is greater than the user entered number or not.

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed number
        int fixedNumber = 50;

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        // Use comparison operator to check
        if (fixedNumber > userNumber) {
            System.out.println(fixedNumber + " is greater than " + userNumber);
        } else if (fixedNumber < userNumber) {
            System.out.println(fixedNumber + " is less than " + userNumber);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}

/*
Output 
Case 1
Enter a number: 30
50 is greater than 30

Case 2
Enter a number: 60
50 is less than 60

*/
