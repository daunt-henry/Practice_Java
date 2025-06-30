// Q.1 Use (Q.1) to calculate surface area and Volume of the Cylinder.

public class Cylinder {

    // Properties (private for encapsulation)
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
}

//  main method to test

public class Main {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();

        // Setting values using setters
        cyl.setRadius(7.5);
        cyl.setHeight(10);

        // Getting values using getters
        System.out.println("Radius of Cylinder: " + cyl.getRadius());
        System.out.println("Height of Cylinder: " + cyl.getHeight());
    }
}


/*
output 
Radius of Cylinder: 7.5
Height of Cylinder: 10.0
*/

// Q.2 Use (Q.1) to calculate surface area and Volume of the Cylinder.

public class Cylinder {

    // Properties (private)
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
        Cylinder cyl = new Cylinder();

        // Set radius and height
        cyl.setRadius(7);
        cyl.setHeight(10);

        // Output
        System.out.println("Radius: " + cyl.getRadius());
        System.out.println("Height: " + cyl.getHeight());
        System.out.println("Surface Area: " + cyl.getSurfaceArea());
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

// Use a constructor and repeat (Q.1)

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
        // Create object using constructor
        Cylinder cyl = new Cylinder(7, 10);

        // Display results
        System.out.println("Radius: " + cyl.getRadius());
        System.out.println("Height: " + cyl.getHeight());
        System.out.println("Surface Area: " + cyl.getSurfaceArea());
        System.out.println("Volume: " + cyl.getVolume());
    }
}


/*
Output 

Radius: 7.0
Height: 10.0
Surface Area: 747.6990515543707
Volume: 1539.3804002589986

*/
