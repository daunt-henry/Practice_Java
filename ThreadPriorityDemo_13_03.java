/*
Question:
Demonstrate getPriority() and setPriority() methods in Java Threads.

Expected Behavior:
- Create multiple threads
- Set different priorities
- Display the priorities using getPriority()

Note: Priority values range from:
- MIN_PRIORITY = 1
- NORM_PRIORITY = 5 (default)
- MAX_PRIORITY = 10
*/

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY);  // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
Expected Output (order may vary):

Thread-1 is running with priority 1
Thread-2 is running with priority 5
Thread-3 is running with priority 10

Note:
- Output order may not reflect priority due to JVM thread scheduler.
- Priorities are suggestions to JVM; not strict execution order.
*/
