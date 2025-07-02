/*
Question:
Write a Java program that prints:
- "HaHa" during an ArithmeticException
- "HeHe" during an IllegalArgumentException

Expected Output:
If division by zero → print HaHa  
If manually thrown illegal argument → print HeHe
*/

public class ExceptionDemo {
    public static void main(String[] args) {

        // Example 1: Arithmetic Exception
        try {
            int result = 10 / 0;  // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        }

        // Example 2: Illegal Argument Exception
        try {
            throw new IllegalArgumentException("Invalid input");  // Manually thrown
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
    }
}

/*
Output:
HaHa
HeHe
*/
