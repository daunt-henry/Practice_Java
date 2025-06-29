// Write a Java program to find out the day of the week given the number [ 1 for Monday 2 for Tuesday ... and 50 on ! ]

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int day = scanner.nextInt();

        // Determine day of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
 



/*
output
case 1
Enter a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): 3
Wednesday

case 2
Enter a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): 50
Invalid input!
*/
