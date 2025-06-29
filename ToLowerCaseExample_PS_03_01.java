// Write a Java program to convert a string to lower case

import java.util.Scanner;

public class ToLowerCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase
        String lower = input.toLowerCase();

        // Display the result
        System.out.println("Lowercase version: " + lower);

        scanner.close();
    }
}


/*
Output 

Enter a string: Hello JAVA
Lowercase version: hello java

*/
