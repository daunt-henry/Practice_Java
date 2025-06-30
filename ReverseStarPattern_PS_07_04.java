/* Write a function to print the following pattern

****
***
**
*

*/

public class ReverseStarPattern {

    // Function to print the reverse triangle pattern
    static void printPattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Print i stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Call the function with 4 rows
        printPattern(4);
    }
}

/*
output 

****
***
**
*

*/
