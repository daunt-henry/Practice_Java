/*
Question:
Wrap the program in Q.3 inside a method which throws a custom exception
(MaxRetriesExceededException) if maximum invalid index access attempts exceed 5.

Expected Output:
Enter the index to access: 6
Invalid index. Try again.
...
Error: Maximum retries exceeded.
*/

import java.util.Scanner;

// ✅ Custom exception definition
class MaxRetriesExceededException extends Exception {
    public MaxRetriesExceededException(String message) {
        super(message);
    }
}

public class ArrayAccessMethod {

    // ✅ Method that throws custom exception
    public static void accessArrayElement() throws MaxRetriesExceededException {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int retries = 0;
        final int MAX_RETRIES = 5;

        while (true) {
            System.out.print("Enter the index to access: ");
            int index = sc.nextInt();

            try {
                System.out.println("Element at index " + index + " is " + arr[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                retries++;
                System.out.println("Invalid index. Try again.");
            }

            if (retries >= MAX_RETRIES) {
                sc.close(); // Close scanner before throwing
                throw new MaxRetriesExceededException("Maximum retries exceeded.");
            }
        }

        sc.close();
    }

    // ✅ main() handles the exception
    public static void main(String[] args) {
        try {
            accessArrayElement(); // method call
        } catch (MaxRetriesExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Sample Output:

Enter the index to access: 8
Invalid index. Try again.
Enter the index to access: -2
Invalid index. Try again.
Enter the index to access: 99
Invalid index. Try again.
Enter the index to access: 6
Invalid index. Try again.
Enter the index to access: 10
Invalid index. Try again.
Error: Maximum retries exceeded.

Or:

Enter the index to access: 2
Element at index 2 is 30
*/
