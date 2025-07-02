/*
Question:
Write a Java program to continuously print "Good Morning" and "Welcome" using threads.

Expected Behavior:
Both messages are printed simultaneously using two separate threads.

Sample Output (interleaved):
Good Morning
Welcome
Good Morning
Welcome
...

Note: Output may vary in order depending on thread scheduling.
*/

class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        GoodMorningThread t1 = new GoodMorningThread();
        WelcomeThread t2 = new WelcomeThread();

        t1.start();
        t2.start();
    }
}


/*
output 
Good Morning
Welcome
Good Morning
Welcome
...
*/
