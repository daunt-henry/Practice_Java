// Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 Subjects and take marks as an imput from the user.


import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        float subject1 = scanner.nextFloat();

        System.out.print("Enter marks for Subject 2: ");
        float subject2 = scanner.nextFloat();

        System.out.print("Enter marks for Subject 3: ");
        float subject3 = scanner.nextFloat();

        // Calculate average percentage
        float total = subject1 + subject2 + subject3;
        float percentage = total / 3;

        // Check pass or fail conditions
        if (percentage >= 40 && subject1 >= 33 && subject2 >= 33 && subject3 >= 33) {
            System.out.println("You passed! Your average is " + percentage + "%.");
        } else {
            System.out.println("You failed. Your average is " + percentage + "%.");
        }

        scanner.close();
    }
}

/*
output 

case 1

Enter marks for Subject 1: 45
Enter marks for Subject 2: 34
Enter marks for Subject 3: 40
You passed! Your average is 39.666668%.

case2

Enter marks for Subject 1: 50
Enter marks for Subject 2: 20
Enter marks for Subject 3: 60
You failed. Your average is 43.333332%.


*/
