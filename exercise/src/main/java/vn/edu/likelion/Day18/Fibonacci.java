package vn.edu.likelion.Day18;

/**
 * Fibonacci -
 *
 * @param
 * @return
 * @throws
 */
public class Fibonacci {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0 ; i<number;i++) {
            System.out.println( fibonacci(i));
        }

    }

    private static int fibonacci(int number) {

        // nếu n =  0; thì trả về 0
        // nếu n = 1 thì trả về 1;

        if(number ==0 || number ==1 )return number;

        return fibonacci(number-1) + fibonacci(number -2);
    }

}
