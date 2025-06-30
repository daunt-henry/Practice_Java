// Create a class circle with a method to initialize its Side, Calculating area, perimeter etc.


public class Circle {

    // Property
    private double radius;

    // Method to set the radius
    public void setRadius(double r) {
        radius = r;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// main method to test 

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.setRadius(7); // Set radius

        System.out.println("Area of circle: " + c.getArea());
        System.out.println("Perimeter (Circumference) of circle: " + c.getPerimeter());
    }
}

/*
output 
Area of circle: 153.93804002589985
Perimeter (Circumference) of circle: 43.982297150257104
*/
