// Use the Pen abstract class from Q1 to create a concrete class FountainPen. This class should implement the write() and refill() methods, and also include an additional method changeNib().

// abstract class

abstract class Pen {
    abstract void write();
    abstract void refill();
}

//  concrete class

class FountainPen extends Pen {

    @Override
    void write() {
        System.out.println("Writing with a fountain pen.");
    }

    @Override
    void refill() {
        System.out.println("Refilling the fountain pen.");
    }

    // Additional method
    void changeNib() {
        System.out.println("Changing the nib of the fountain pen.");
    }
}

// main method to test

/*
output 
Writing with a fountain pen.
Refilling the fountain pen.
Changing the nib of the fountain pen.
*/
