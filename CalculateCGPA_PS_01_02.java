// Write a program to calculate CGPA using marks of three subjects ( out of 100)

public class CalculateCGPA {
    public static void main(String[] args) {
        // Marks out of 100 for three subjects
        double subject1 = 85;
        double subject2 = 90;
        double subject3 = 80;

        // Calculate average percentage
        double totalMarks = subject1 + subject2 + subject3;
        double percentage = totalMarks / 3;

        // Convert percentage to CGPA (Assuming CGPA = percentage / 9.5)
        double cgpa = percentage / 9.5;

        // Round to two decimal places
        cgpa = Math.round(cgpa * 100.0) / 100.0;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + percentage);
        System.out.println("CGPA (out of 10): " + cgpa);
    }
}


/*
Output 

Total Marks: 255.0
Average Percentage: 85.0
CGPA (out of 10): 8.95

*/
