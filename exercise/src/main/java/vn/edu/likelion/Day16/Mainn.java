package vn.edu.likelion.Day16;

/**
 * Mainn -
 *
 * @param
 * @return
 * @throws
 */
public class Mainn {
    public static void main(String[] args) {
        Runnable task1 = new PrintEvenUseThread();
        Thread thread1 = new Thread(task1);
        Runnable task2 = new PrintOddUseThread();
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

    }
}
