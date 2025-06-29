// Write a Java program to detect double and triple spaces in a string


public class DetectSpaces {
    public static void main(String[] args) {
        // Sample string with spaces
        String text = "This  is a sentence with  double and   triple spaces.";

        // Check for double spaces
        int doubleSpaceIndex = text.indexOf("  ");
        if (doubleSpaceIndex != -1) {
            System.out.println("Double space found at index: " + doubleSpaceIndex);
        } else {
            System.out.println("No double spaces found.");
        }

        // Check for triple spaces
        int tripleSpaceIndex = text.indexOf("   ");
        if (tripleSpaceIndex != -1) {
            System.out.println("Triple space found at index: " + tripleSpaceIndex);
        } else {
            System.out.println("No triple spaces found.");
        }
    }
}



/*
Output 

Double space found at index: 4
Triple space found at index: 42

*/
