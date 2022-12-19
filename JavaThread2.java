public class JavaThread2 implements Runnable {
    /*
     * To create thread you can also implement to Runnable
     * and use abstract method run to create the thread!
     */

    public static void main(String[] args) {
        /*
         * To start the thread with Runnable interface,
         */

        /* Pass the class obj to Thread objects constructor! */
        JavaThread2 obj = new JavaThread2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is running out of thread!");

    }

    public void run() {
        System.out.println("This code is running in a thread by Runnable abstract method!");
    }

}

class Concurrent extends Thread {
    /*
     * When working with a thread the order of code is unpredictable
     * so when the threads and main program are reading and writing the same
     * variables, the values are unpredictable!
     */

    public static int amount = 0;

    public static void main(String[] args) {
        /*
         * To prevent concurrency problems use isAlive()
         */
        Concurrent thread = new Concurrent();
        thread.start();
        // Wait for the completed works on thread!
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Concurrent: " + amount);
        amount++;
        System.out.println("Concurrent: " + amount);

    }

    public void run() {
        amount++;
    }
}
