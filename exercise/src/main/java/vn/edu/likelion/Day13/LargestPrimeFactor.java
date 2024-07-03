package vn.edu.likelion.Day13;

import java.util.function.*;
import java.util.stream.IntStream;

/**
 * LargestPrimeFactor -
 *
 * @param
 * @return
 * @throws
 */
public class LargestPrimeFactor {


    /**
     * Factor là những số có thể chia hết được cho các số đó.;
     * 6 =
     * 6/6 = 1 result
     * 6/3 = 2 result
     * 6/2 = 3
     * 6/1 = 6
     * trong các số trong result 1 2 3 6 là kết quả
     *         3 và 2 là số nguyên tố
     * Nên LargestPrimeFactor là số 3.
     *
     *
     * @param num
     * @return
     */
    public boolean isFactor2(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2 ; i <= num/2 ; i++) {
            if (num%i ==0) {
                return false;
            }
        }
        return true;
    }

    Factor isFactor = (num) ->{
        if (num <= 1) {
            return false;
        }
        for (int i = 2 ; i <= num/2 ; i++) {
            if (num%i ==0) {
                return false;
            }
        }
        return true;
    };

    public int findLargestPrimeFactor(int num) {
        int max = 0;
        for (int i = 1; i <= num ; i++) {
            if (num% i ==0 ){
                if (isFactor.isFactor(i)) {
                    max = i;
                }
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int num = 176;
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        System.out.println( largestPrimeFactor.findLargestPrimeFactor(num));
    }
}
