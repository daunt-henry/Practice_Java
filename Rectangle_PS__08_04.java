// Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters

public class Rectangle {

    // Properties
    private int length;
    private int breadth;

    // Default constructor: sets length = 4 and breadth = 5
    public Rectangle() {
        length = 4;
        breadth = 5;
    }

    // Parameterized constructor: allows custom values
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    public int getArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public int getPerimeter() {
        return 2 * (length + breadth);
    }

    // Getters (optional)
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

// main method to test

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Breadth: " + rect1.getBreadth());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println();

        // Using parameterized constructor
        Rectangle rect2 = new Rectangle(10, 8);
        System.out.println("Custom Rectangle:");
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Breadth: " + rect2.getBreadth());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}

/*
Output 

Default Rectangle:
Length: 4
Breadth: 5
Area: 20
Perimeter: 18

Custom Rectangle:
Length: 10
Breadth: 8
Area: 80
Perimeter: 36

*/
