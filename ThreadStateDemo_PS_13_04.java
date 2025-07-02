/*
Question:
Write a Java program to demonstrate how to get the state of a thread using the getState() method.

Expected Output:
- Before starting the thread, the state should be NEW.
- After starting and waiting, the thread may be RUNNABLE or TERMINATED depending on timing.

States can include:
NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
*/

public class ThreadStateDemo {
    public static void main(String[] args) {
        // Create a thread using lambda expression
        Thread t = new Thread(() -> {
            System.out.println("Thread is running...");
        });

        // Get and print state before starting the thread
        System.out.println("State before start: " + t.getState()); // Expected: NEW

        // Start the thread
        t.start();

        // Wait briefly to let the thread finish
        try {
            Thread.sleep(100); // 100 ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get and print state after starting (may be TERMINATED)
        System.out.println("State after run: " + t.getState()); // Likely: TERMINATED
    }
}

/*
Sample Output:
State before start: NEW
Thread is running...
State after run: TERMINATED

Note:
- The second state might be RUNNABLE or TERMINATED depending on thread scheduler timing.
- To observe more states like TIMED_WAITING, use Thread.sleep() inside the thread.
*/
