/*
Question:
Write a program that allows you to keep accessing an array until a valid index is given.
If maximum retries exceed 5, print "Error" and exit.

Expected Output (example):
Enter the index to access: 7
Invalid index. Try again.
Enter the index to access: -1
Invalid index. Try again.
...
Error (if more than 5 invalid attempts)

Or:
Enter the index to access: 2
Element at index 2 is 30
*/

import java.util.Scanner;

public class ArrayAccessWithRetry {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int retries = 0;
        final int MAX_RETRIES = 5;

        while (true) {
            System.out.print("Enter the index to access: ");
            int index = sc.nextInt();

            try {
                System.out.println("Element at index " + index + " is " + arr[index]);
                break; // Valid index, exit loop
            } catch (ArrayIndexOutOfBoundsException e) {
                retries++;
                System.out.println("Invalid index. Try again.");
            }

            if (retries >= MAX_RETRIES) {
                System.out.println("Error");
                break;
            }
        }

        sc.close();
    }
}

/*
Sample Output 1:
Enter the index to access: 7
Invalid index. Try again.
Enter the index to access: -2
Invalid index. Try again.
Enter the index to access: 100
Invalid index. Try again.
Enter the index to access: 4
Element at index 4 is 50

Sample Output 2 (invalid 5 times):
Enter the index to access: 9
Invalid index. Try again.
...
Error
*/
