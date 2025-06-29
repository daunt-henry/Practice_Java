// Write a Java program to detect whether a number entered by the user is integer or not

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        
        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("The value " + number + " is an integer.");
        } else {
            String input = scanner.next();
            System.out.println("The value \"" + input + "\" is NOT an integer.");
        }

        scanner.close();
    }
}

/*
Output 
case 1
Enter a value: 42
The value 42 is an integer.

case 2
Enter a value: 3.14
The value "3.14" is NOT an integer.
*/
