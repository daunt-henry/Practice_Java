// Write a Java program to replace spaces with underscores-


import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Replace spaces with underscores
        String result = input.replace(' ', '_');

        // Display the result
        System.out.println("Modified string: " + result);

        scanner.close();
    }
}


/*
Output 

Enter a string: Java is fun
Modified string: Java_is_fun

*/
