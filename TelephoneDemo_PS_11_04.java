/*
Question:
Create a class Telephone with ring(), lift(), and disconnect() methods as abstract methods.
Create another class SmartTelephone that implements these methods.
Demonstrate polymorphism using a Telephone reference to a SmartTelephone object.

Expected Output:
Ringing from Smart Telephone...
Call lifted on Smart Telephone.
Call disconnected on Smart Telephone.
*/

// Abstract class Telephone
abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

// Concrete class SmartTelephone
class SmartTelephone extends Telephone {

    @Override
    void ring() {
        System.out.println("Ringing from Smart Telephone...");
    }

    @Override
    void lift() {
        System.out.println("Call lifted on Smart Telephone.");
    }

    @Override
    void disconnect() {
        System.out.println("Call disconnected on Smart Telephone.");
    }

    // Optional extra method
    void browseInternet() {
        System.out.println("Browsing internet on Smart Telephone...");
    }
}

// Main class to demonstrate polymorphism
public class TelephoneDemo {
    public static void main(String[] args) {

        // Polymorphism: Telephone reference, SmartTelephone object
        Telephone t = new SmartTelephone();

        t.ring();         // Executes SmartTelephone's ring()
        t.lift();         // Executes SmartTelephone's lift()
        t.disconnect();   // Executes SmartTelephone's disconnect()

        // t.browseInternet(); // ❌ Not allowed, since t is of type Telephone
    }
}

/*
Output:
Ringing from Smart Telephone...
Call lifted on Smart Telephone.
Call disconnected on Smart Telephone.
*/
