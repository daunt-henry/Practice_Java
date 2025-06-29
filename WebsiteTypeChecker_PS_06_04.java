/*
Write a program to find out the type of website from the url

Com→ Commertial website

org → organization website

in → Indian website

*/

import java.util.Scanner;

public class WebsiteTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a website URL
        System.out.print("Enter a website URL: ");
        String url = scanner.nextLine().toLowerCase();

        // Check the domain type
        if (url.endsWith(".com")) {
            System.out.println("This is a Commercial website.");
        } else if (url.endsWith(".org")) {
            System.out.println("This is an Organization website.");
        } else if (url.endsWith(".in")) {
            System.out.println("This is an Indian website.");
        } else {
            System.out.println("Unknown website type.");
        }

        scanner.close();
    }
}


/*
output 

case 1
Enter a website URL: www.google.com
This is a Commercial website.

case 2
Enter a website URL: www.ngo.org
This is an Organization website.

case 3
Enter a website URL: www.irctc.in
This is an Indian website.


*/
