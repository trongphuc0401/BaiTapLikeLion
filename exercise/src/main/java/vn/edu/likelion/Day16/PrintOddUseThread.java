package vn.edu.likelion.Day16;

/**
 * PrintOddUseThread -
 *
 * @param
 * @return
 * @throws
 */
public class PrintOddUseThread implements Runnable{



    @Override
    public void run() {
        for(int i = 1 ; i<= 20;i++) {
            if (i%2 ==1) {
                System.out.println("Odd Number from oddThread: " + i);
                processing();
            }
        }


    }
    private void processing() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
