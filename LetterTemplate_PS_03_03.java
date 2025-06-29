/*
Write a Java program to fill in a letter template which boks like bebw

letter = "Dear </name 17, Thans a lot"

Replace / namely with a string (some name)

*/

public class LetterTemplate {
    public static void main(String[] args) {
        // Original letter template with placeholder
        String letter = "Dear </name 17, Thanks a lot";

        // Replace </name with actual name
        String name = "Henry";
        String modifiedLetter = letter.replace("</name", name);

        // Display the final letter
        System.out.println(modifiedLetter);
    }
}


/*
output 

Dear Henry 17, Thanks a lot

*/
