// Create a class Circle and use inheritance to create Another Class Cylinder from it.


// Base class: Circle
public class Circle {
    protected double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference) of circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Derived class: Cylinder (inherits from Circle)
public class Cylinder extends Circle {
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius); // Call Circle constructor
        this.height = height;
    }

    // Method to calculate volume of cylinder
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate surface area of cylinder: 2πr² + 2πrh
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}

// main method to test

public class Main {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(7, 10);

        System.out.println("Radius: " + cyl.radius);
        System.out.println("Base Area (Circle): " + cyl.getArea());
        System.out.println("Base Perimeter: " + cyl.getPerimeter());
        System.out.println("Surface Area (Cylinder): " + cyl.getSurfaceArea());
        System.out.println("Volume (Cylinder): " + cyl.getVolume());
    }
}

/*
output 

Radius: 7.0
Base Area (Circle): 153.93804002589985
Base Perimeter: 43.982297150257104
Surface Area (Cylinder): 747.6990515543707
Volume (Cylinder): 1539.3804002589986

*/
