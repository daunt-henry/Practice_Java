/*
Question:
Use a built-in package in Java to write a class which displays a message (using sout)
after taking input from the user.

Built-in package used: java.util (Scanner class)

Expected Input/Output:
Enter your name: Henry
Hello Henry, welcome!
*/

import java.util.Scanner; // built-in package

public class MessageDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // take string input

        System.out.println("Hello " + name + ", welcome!"); // display message

        sc.close(); // optional, but good practice
    }
}

/*
Sample Output:
Enter your name: Henry
Hello Henry, welcome!
*/
