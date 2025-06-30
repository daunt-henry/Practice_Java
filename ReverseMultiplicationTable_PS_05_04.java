// Write a program to print multiplication table of 10 in reverse order.


public class ReverseMultiplicationTable {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Multiplication table of 10 in reverse order:");

        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}


/*
Multiplication table of 10 in reverse order:
10 x 10 = 100
10 x 9 = 90
10 x 8 = 80
10 x 7 = 70
10 x 6 = 60
10 x 5 = 50
10 x 4 = 40
10 x 3 = 30
10 x 2 = 20
10 x 1 = 10
*/
