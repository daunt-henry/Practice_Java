// Write a function to find average of a set of numbers  passed as arguments


public class AverageCalculator {

    // Function to calculate average using varargs
    static double average(int... numbers) {
        if (numbers.length == 0) {
            return 0; // Avoid division by zero
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        // Call the average function with a set of numbers
        double result = average(10, 20, 30, 40, 50);

        System.out.println("Average is: " + result);
    }
}


/*
output 
Average is: 30.0
*/
