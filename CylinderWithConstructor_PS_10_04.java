// Create methods for area & volume in Q.2. Also create getters and setters


public class Cylinder {

    // Properties
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate surface area: 2πr² + 2πrh
    public double getArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    // Method to calculate volume: πr²h
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}


// main method to test

public class Main {
    public static void main(String[] args) {
        // Create object using constructor
        Cylinder cyl = new Cylinder(7, 10);

        // Use getters
        System.out.println("Radius: " + cyl.getRadius());
        System.out.println("Height: " + cyl.getHeight());

        // Calculate and print area and volume
        System.out.println("Surface Area: " + cyl.getArea());
        System.out.println("Volume: " + cyl.getVolume());
    }
}


/*
output 

Radius: 7.0
Height: 10.0
Surface Area: 747.6990515543707
Volume: 1539.3804002589986

*/
