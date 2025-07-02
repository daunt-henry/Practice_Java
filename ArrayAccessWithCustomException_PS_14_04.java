/*
Question:
Modify the program to throw a custom exception if maximum retries are reached (e.g., more than 5 attempts to access an invalid index in an array).

Expected Output:
Enter the index to access: 7
Invalid index. Try again.
...
Error: Maximum retries exceeded.

*/

import java.util.Scanner;

// ✅ Custom Exception
class MaxRetriesExceededException extends Exception {
    public MaxRetriesExceededException(String message) {
        super(message);
    }
}

public class ArrayAccessWithCustomException {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int retries = 0;
        final int MAX_RETRIES = 5;

        try {
            while (true) {
                System.out.print("Enter the index to access: ");
                int index = sc.nextInt();

                try {
                    System.out.println("Element at index " + index + " is " + arr[index]);
                    break; // ✅ Valid access — exit loop
                } catch (ArrayIndexOutOfBoundsException e) {
                    retries++;
                    System.out.println("Invalid index. Try again.");
                }

                if (retries >= MAX_RETRIES) {
                    throw new MaxRetriesExceededException("Maximum retries exceeded.");
                }
            }
        } catch (MaxRetriesExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

/*
Sample Output (invalid 5 times):

Enter the index to access: 8
Invalid index. Try again.
Enter the index to access: -1
Invalid index. Try again.
Enter the index to access: 99
Invalid index. Try again.
Enter the index to access: 6
Invalid index. Try again.
Enter the index to access: 10
Invalid index. Try again.
Error: Maximum retries exceeded.

Or if valid early:
Enter the index to access: 2
Element at index 2 is 30
*/
