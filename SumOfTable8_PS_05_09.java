// Write a program to calculate the sum of the numbers occuring in the multiplication table of 8.

public class SumOfTable8 {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;

        // Loop from 1 to 10 and calculate the sum of products
        for (int i = 1; i <= 10; i++) {
            sum += n * i;
        }

        // Print the result
        System.out.println("Sum of the numbers in the multiplication table of 8 is: " + sum);
    }
}

/*
output 
Sum of the numbers in the multiplication table of 8 is: 440
*/
