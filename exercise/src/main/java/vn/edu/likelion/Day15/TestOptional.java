package vn.edu.likelion.Day15;

import vn.edu.likelion.Day10.Bai1.Bike;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * TestOptional -
 *
 * @param
 * @return
 * @throws
 */
public class TestOptional {
    public static void main(String[] args) {
        String phucHoi = "";
        Optional<String> optionalPhuc = Optional.empty();
        System.out.println(optionalPhuc);

        Optional<Bike> optionalBike = Optional.empty();

        boolean arequal = optionalPhuc.equals(optionalBike);
        System.out.println("Are optionalPhuc and optionalBike equal? " + arequal);
    }

}
