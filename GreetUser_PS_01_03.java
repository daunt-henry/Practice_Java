//Write a Java Program which asks the user to enter his/her name and greets them with "Hello<name>, have a good day" text.

  


import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display greeting message
        System.out.println("Hello " + name + ", have a good day!");

        scanner.close();
    }
}


/*
Output 

Enter your name: Henry
Hello Henry, have a good day!

*/
