// Create a class Tommy Vecetti for Rockstar Games Capable of hitting (print hitting), running, firing etc.


public class TommyVecetti {

    // Method to simulate hitting
    public void hit() {
        System.out.println("Tommy is hitting the enemy!");
    }

    // Method to simulate running
    public void run() {
        System.out.println("Tommy is running fast!");
    }

    // Method to simulate firing
    public void fire() {
        System.out.println("Tommy is firing a gun!");
    }
}

// main method to test 

public class Main {
    public static void main(String[] args) {
        TommyVecetti tommy = new TommyVecetti();

        tommy.hit();
        tommy.run();
        tommy.fire();
    }
}


/*
output 
Tommy is hitting the enemy!
Tommy is running fast!
Tommy is firing a gun!
*/
