// Create a class rectangle with a method to initialize its Side, Calculating area, perimeter etc.


public class Rectangle {

    // Properties
    private int length;
    private int breadth;

    // Method to set the sides of the rectangle
    public void setDimensions(int l, int b) {
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
}

// main method to test

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.setDimensions(10, 5); // Set length and breadth

        System.out.println("Area of rectangle: " + rect.getArea());
        System.out.println("Perimeter of rectangle: " + rect.getPerimeter());
    }
}


/*
output 
Area of rectangle: 50
Perimeter of rectangle: 30
*/
