package vn.edu.likelion.Day15;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * ReviewDuplicateElment -
 *
 * @param
 * @return
 * @throws
 */
public class ReviewDuplicateElment {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,23,22,23,24,24,33,15,26,15);
        Set<Integer> setDuplicate = new HashSet<>();
        List<Integer> removeDuplicateElement = list.stream().distinct().toList();
        List<Integer> removeDuplicateElement1 = list.stream().filter(setDuplicate::add)
                        .toList();
        System.out.println(list);
        System.out.println(removeDuplicateElement1);
    }
}
