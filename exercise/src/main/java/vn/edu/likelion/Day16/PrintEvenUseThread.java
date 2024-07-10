package vn.edu.likelion.Day16;

/**
 * PrintOddAndEvenUseThread -
 *
 * @param
 * @return
 * @throws
 */
public class PrintEvenUseThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number from evenThread: " + i);
                processing();
            }
        }

    }

    private void processing() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
