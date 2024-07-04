package vn.edu.likelion.Day14;

import java.util.Arrays;
import java.util.List;

/**
 * FindAverageByLambda -
 *Viết chương trình Java để triển khai biểu thức lambda nhằm tìm giá trị trung bình của một danh sách các số double.
 * @param
 * @return
 * @throws
 */
public class FindAverageByLambda {


    public static void main(String[] args) {
        List<Double> list = Arrays.asList(2.2,3.2,4.6,6.2,3.1,2.2);

        double avarage = list
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(avarage);
    }
}
