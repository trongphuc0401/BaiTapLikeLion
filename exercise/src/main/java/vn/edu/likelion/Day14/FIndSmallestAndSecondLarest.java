package vn.edu.likelion.Day14;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Arrays;
import java.util.Comparator;

/**
 * FIndSmallestAndSecondLarest -
 *
 * @param
 * @return
 * @throws
 */
public class FIndSmallestAndSecondLarest {


    public int findSecondLargest(Integer[] arr) {
        return Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
    }



    public int findSmallest(Integer[] arr) {
        return Arrays.stream(arr)
                .sorted()
                .skip(0)
                .findFirst()
                .orElse(0);
    }

    public static void main(String[] args) {
        Integer[] arr = {1,7,18,25,77,300,101};
        FIndSmallestAndSecondLarest fIndSmallestAndSecondLarest = new FIndSmallestAndSecondLarest();

        System.out.println("Second largest element: "+fIndSmallestAndSecondLarest.findSecondLargest(arr));
        System.out.println("First smallest element: "+fIndSmallestAndSecondLarest.findSmallest(arr));
    }
}
