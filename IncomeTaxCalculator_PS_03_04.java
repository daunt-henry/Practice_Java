/*
Write a Java program to calculate the income tax paid by an employee based on the following income slabs:

Income up to ₹2.5 lakhs → No tax

Income from ₹2.5 lakhs to ₹5 lakhs → Taxed at 5%

Income from ₹5.01 lakhs to ₹10 lakhs → Taxed at 20%

Income above ₹10 lakhs → Taxed at 30%

Note that there is no tax below 2:51. Take input amount as an input from the user.
*/

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take income as input
        System.out.print("Enter your annual income (in ₹): ");
        double income = scanner.nextDouble();

        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.05 * (income - 250000);
        } else if (income <= 1000000) {
            tax = 0.05 * (500000 - 250000); // 5% on 2.5L
            tax += 0.20 * (income - 500000); // 20% on remaining
        } else {
            tax = 0.05 * (500000 - 250000); // 5% on 2.5L
            tax += 0.20 * (1000000 - 500000); // 20% on 5L
            tax += 0.30 * (income - 1000000); // 30% on remaining
        }

        System.out.println("Income Tax to be paid: ₹" + tax);

        scanner.close();
    }
}


/*
output 
Enter your annual income (in ₹): 600000
Income Tax to be paid: ₹32500.0
*/
