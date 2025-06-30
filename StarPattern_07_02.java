/* Write a program using functions to print the following pattern:

*
**
***
****

*/

public class StarPattern {

    // Function to print the pattern
    static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print i stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        // Call the function with 4 rows
        printPattern(4);
    }
}



/*

output 

*
**
***
****

*/
