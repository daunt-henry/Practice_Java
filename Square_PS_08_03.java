// Create a class Square with a method to initialize its Side, Calculating area, perimeter etc.


public class Square {

    // Property
    private int side;

    // Method to set the side of the square
    public void setSide(int s) {
        side = s;
    }

    // Method to calculate area
    public int getArea() {
        return side * side;
    }

    // Method to calculate perimeter
    public int getPerimeter() {
        return 4 * side;
    }
}

// main method to test

public class Main {
    public static void main(String[] args) {
        Square sq = new Square();

        sq.setSide(5); // Set side length

        System.out.println("Area of square: " + sq.getArea());
        System.out.println("Perimeter of square: " + sq.getPerimeter());
    }
}

/*
output 
Area of square: 25
Perimeter of square: 20
*/
