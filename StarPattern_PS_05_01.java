/* Write a program to print the following pattern:

****
***
**
*

*/

public class StarPattern {
    public static void main(String[] args) {
        // Outer loop for rows (starts from 4 to 1)
        for (int i = 4; i >= 1; i--) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars
            System.out.println();
        }
    }
}

/*

output 

****
***
**
*

*/
