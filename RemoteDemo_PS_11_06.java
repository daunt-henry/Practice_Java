/*
Q.6. Create an interface TVRemote and use it to inherit another interface SmartTVRemote.
Then implement the SmartTVRemote interface in a class and demonstrate the usage.

Expected Output:
Turning on the TV...
Changing channel...
Using Smart features...
*/

// Base interface
interface TVRemote {
    void turnOn();
    void changeChannel();
}

// Derived interface extending TVRemote
interface SmartTVRemote extends TVRemote {
    void useSmartFeatures();
}

// Concrete class implementing SmartTVRemote
class SmartTV implements SmartTVRemote {

    @Override
    public void turnOn() {
        System.out.println("Turning on the TV...");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing channel...");
    }

    @Override
    public void useSmartFeatures() {
        System.out.println("Using Smart features...");
    }
}

// Main class to demonstrate
public class RemoteDemo {
    public static void main(String[] args) {
        SmartTVRemote remote = new SmartTV(); // Polymorphic reference

        remote.turnOn();
        remote.changeChannel();
        remote.useSmartFeatures();
    }
}

/*
Output:
Turning on the TV...
Changing channel...
Using Smart features...
*/
