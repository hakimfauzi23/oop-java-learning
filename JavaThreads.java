public class JavaThreads extends Thread {
    /*
     * Threads allows a program to operate more efficiently by doing
     * multiple things at the same time!
     * 
     * To create Thread first, class must be extends Thread Java Class.
     * and Override it's run() method.
     */

    public static void main(String[] args) {

        /* To start the threads. use start() method! */
        JavaThreads thread = new JavaThreads();
        thread.start();
        System.out.println("This code is outside the thread!");
    }

    // Override run() method from Thread Class
    public void run() {
        System.out.println("This code is running in a thread!");
    }  



}

/* Go to Next File JavaThreads2 to see another thread way. */
