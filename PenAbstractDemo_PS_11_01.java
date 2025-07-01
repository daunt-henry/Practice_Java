// Create an abstract class Pen with methods write() and refill() as abstract methods


// Abstract class Pen
abstract class Pen {

    // Abstract method to write
    abstract void write();

    // Abstract method to refill
    abstract void refill();
}

// Example implementation 

// Concrete class extending Pen
class FountainPen extends Pen {

    @Override
    void write() {
        System.out.println("Writing with a fountain pen.");
    }

    @Override
    void refill() {
        System.out.println("Refilling the fountain pen.");
    }
}

// main method to test

public class Main {
    public static void main(String[] args) {
        Pen myPen = new FountainPen();
        myPen.write();
        myPen.refill();
    }
}

/*
output 
Writing with a fountain pen.
Refilling the fountain pen.
*/
