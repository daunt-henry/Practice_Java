/*
Question:
Write a Java program to continuously print "Good Morning" and "Welcome" using threads.
Add a sleep method in WelcomeThread to delay its execution by 200 milliseconds.

Expected Behavior:
Both threads run concurrently, but "Welcome" prints faster due to the shorter delay (200 ms)
compared to "Good Morning" (1000 ms).
*/

// Thread to print "Good Morning" every 1 second
class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // sleep for 1 second (1000 ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Thread to print "Welcome" every 200 milliseconds
class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200); // sleep for 200 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class to start both threads
public class ThreadDemo {
    public static void main(String[] args) {
        GoodMorningThread t1 = new GoodMorningThread();
        WelcomeThread t2 = new WelcomeThread();

        t1.start();
        t2.start();
    }
}

/*
Expected Output (timing varies, output interleaves):

Welcome
Welcome
Welcome
Welcome
Welcome
Good Morning
Welcome
Welcome
Welcome
Welcome
Good Morning
...

Explanation:
- "Welcome" prints ~5 times between each "Good Morning" because of 200 ms vs 1000 ms delays.
- Output order may vary slightly due to thread scheduling by the JVM.
*/
