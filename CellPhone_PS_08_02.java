// Create a class cellphone with methods to print "ringing. "Vibrating...etc

public class CellPhone {

    // Method to simulate ringing
    public void ring() {
        System.out.println("Ringing...");
    }

    // Method to simulate vibrating
    public void vibrate() {
        System.out.println("Vibrating...");
    }

    // Method to simulate calling
    public void callFriend() {
        System.out.println("Calling your friend...");
    }
}

// main method to test

public class Main {
    public static void main(String[] args) {
        CellPhone myPhone = new CellPhone();

        myPhone.ring();
        myPhone.vibrate();
        myPhone.callFriend();
    }
}

/*
output 

Ringing...
Vibrating...
Calling your friend...

*/
