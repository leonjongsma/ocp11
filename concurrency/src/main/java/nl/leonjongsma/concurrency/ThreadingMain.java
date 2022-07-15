package nl.leonjongsma.concurrency;

/**
 * This code describes a thread race condition, where the thread th1 and th2 are competing for the same resource.
 * Without synchronization, a memory consistency error is possible. While one thread is incrementing the counter
 * variable value, the other thread could be outputting the previous value. Because the block for incrementing
 * and reading the value is synchronized, counter will reach the value 4 and will not be incremented again. A
 * synchronized method or block ensures that only a single method can access the target code, guaranteeing a
 * single order of execution.
 *
 * The result is not likely to be 0 1 2 3 4 5, 0 1 3 4 5 2 or 2 3 2 5 4 because the counter variable value would
 * be incremented at least once before its value is outputted and would not be incremented to 5.
 */


public class ThreadingMain extends Thread {
    private static int counter;

    public static void main(String[] args) {
        counter = 0;
        Thread th1 = new ThreadingMain();
        Thread th2 = new ThreadingMain();
        th1.start();
        th2.start();
    }

    public void run() {
        while (counter < 4) {
            synchronized (this) {
                counter++;
                System.out.println(counter + " ");
            }
        }
    }
}
