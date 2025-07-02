/*
Question:
Write a Java program to demonstrate:
1. Syntax Error
2. Logical Error
3. Runtime Error

Explanation:
- Syntax Error: Code that doesn’t compile (e.g., missing semicolon)
- Logical Error: Code that compiles & runs but gives wrong output
- Runtime Error: Error that occurs while the program is running (e.g., divide by zero)

Expected Output:
Logical Error Demonstration:
Expected area = 50
Wrong area = 500

Runtime Error Demonstration:
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at ErrorDemo.main(ErrorDemo.java:49)
*/

public class ErrorDemo {
    public static void main(String[] args) {

        // 1. Syntax Error (UNCOMMENT TO SEE COMPILATION ERROR)
        // int x = 10  // ❌ Missing semicolon — This is a syntax error
        // System.out.println(x)

        // 2. Logical Error Example
        int length = 10;
        int breadth = 5;

        // Correct area = length * breadth = 50
        // But mistake: using + instead of * (logical error)
        int wrongArea = length + breadth;

        System.out.println("Logical Error Demonstration:");
        System.out.println("Expected area = " + (length * breadth));
        System.out.println("Wrong area = " + wrongArea);
        System.out.println();

        // 3. Runtime Error Example
        System.out.println("Runtime Error Demonstration:");
        int a = 10;
        int b = 0;
        int c = a / b; // ❌ Division by zero → causes ArithmeticException

        System.out.println("Result: " + c); // This line will not execute
    }
}

/*
Expected Output (until runtime error):

Logical Error Demonstration:
Expected area = 50
Wrong area = 15

Runtime Error Demonstration:
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at ErrorDemo.main(ErrorDemo.java:49)
*/
