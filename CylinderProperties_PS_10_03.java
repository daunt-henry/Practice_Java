// Create methods for area and Volume in Q.1


public class Cylinder {

    // Properties
    private double radius;
    private double height;

    // Setter for radius
    public void setRadius(double r) {
        radius = r;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for height
    public void setHeight(double h) {
        height = h;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate surface area: 2πr² + 2πrh
    public double getSurfaceArea() {
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
        Cylinder c = new Cylinder();

        // Set radius and height
        c.setRadius(7);
        c.setHeight(10);

        // Print values
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Surface Area: " + c.getSurfaceArea());
        System.out.println("Volume: " + c.getVolume());
    }
}


/*
output 

Radius: 7.0
Height: 10.0
Surface Area: 747.6990515543707
Volume: 1539.3804002589986

*/
