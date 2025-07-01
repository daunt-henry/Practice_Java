// Create a class Rectangle and use inheritance to create Another class Cuboid. Try to keep it as close to real world scenario as possible.

// rectangle.java

public class Rectangle {
    protected double length;
    protected double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double getArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}

// cuboid.java

public class Cuboid extends Rectangle {
    private double height;

    // Constructor
    public Cuboid(double length, double breadth, double height) {
        super(length, breadth); // Call Rectangle constructor
        this.height = height;
    }

    // Method to calculate volume
    public double getVolume() {
        return length * breadth * height;
    }

    // Method to calculate surface area: 2(lb + bh + lh)
    public double getSurfaceArea() {
        return 2 * (length * breadth + breadth * height + length * height);
    }

    // Optional: Getter for height
    public double getHeight() {
        return height;
    }
}

// main method to test

public class Main {
    public static void main(String[] args) {
        // Create a cuboid with length=10, breadth=5, height=4
        Cuboid cuboid = new Cuboid(10, 5, 4);

        System.out.println("Length: " + cuboid.length);
        System.out.println("Breadth: " + cuboid.breadth);
        System.out.println("Height: " + cuboid.getHeight());
        System.out.println("Base Area (Rectangle): " + cuboid.getArea());
        System.out.println("Base Perimeter: " + cuboid.getPerimeter());
        System.out.println("Surface Area (Cuboid): " + cuboid.getSurfaceArea());
        System.out.println("Volume (Cuboid): " + cuboid.getVolume());
    }
}

/*

output 
Length: 10.0
Breadth: 5.0
Height: 4.0
Base Area (Rectangle): 50.0
Base Perimeter: 30.0
Surface Area (Cuboid): 220.0
Volume (Cuboid): 200.0

*/



