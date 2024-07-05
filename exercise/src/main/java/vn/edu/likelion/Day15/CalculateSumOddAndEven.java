package vn.edu.likelion.Day15;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * CalculateSumOddAndEven -
 *
 * @param
 * @return
 * @throws
 */
public class CalculateSumOddAndEven {

    public static void main(String[] args) {

       int[] list = {1,2,3,4,5,6,7,8,9,10,12,14};

        // Optional<Integer> streamSumOfEven = list.stream().filter(i-> i%2 ==0).reduce(Integer::sum);
        System.out.println("Sum of even numbers: "+Arrays.stream(list).filter(i->i%2==0).sum());

        // Optional<Integer> streamSumOfOdd = list.stream().filter(i-> i%2 ==1).reduce(Integer::sum);
        System.out.println("Sum of odd numbers: "+Arrays.stream(list).filter(i->i%2==1).sum());

    }
}
