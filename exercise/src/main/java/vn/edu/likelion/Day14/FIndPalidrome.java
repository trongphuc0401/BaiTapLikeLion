package vn.edu.likelion.Day14;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FIndPalidrome - Triển khai biểu thức lambda nhằm để tìm kiếm tra xem chuỗi có phải là
 *palindrome hay ko
 * sử dụng làm lambda để sử dụng để làm cái này,
 *
 * Giải
 * Đặt hai biến để duyệt (while) qua từ đầu và cuối mãng
 * sẽ là i: đầu mảnhg
 *       j: cuối mảng = s.length() - 1;
 *
 *  kiểm tra s.char(i) == s.char(j) hay ko
 *  sau đó trong vong lặp cho i++ đi về sau và j đi ngược lại j-- và return về true hoặc return về false
 *
 *
 * @param
 * @return
 * @throws
 */
public class FIndPalidrome {

    public boolean isPalidrome(String s) {
        int i  = 0 ;
        int j  = s.length() -1 ;
        while(i<j) {
            if (s.charAt(i) ==s.charAt(j)) {
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;

    }

    public boolean isPalidromeUseJava8(String s) {

        BiPredicate<Integer,Integer> checkPalidrome = (left,right) -> s.charAt(left) == s.charAt(right);

        return IntStream.range(0 , s.length())
                .flatMap(left -> IntStream.range(left +1 ,s.length())
                        .filter(right -> checkPalidrome.test(left,right)))
                .findFirst()
                .isPresent();
    }

    public boolean isPalidromeUseStream(String s) {

        char[] list = s.toCharArray();
        return IntStream.range(0,s.length()/2)
                .allMatch(i  -> list[i] == list[s.length()-1-i]);

    }


    public static void main(String[] args) {

        String s1 = "radar";
        String s2 = "Madam";
        String s3 = "defied";
        FIndPalidrome fIndPalidrome = new FIndPalidrome();
        System.out.println(s1+ " is a palindrome? "+ fIndPalidrome.isPalidromeUseStream(s1));
        System.out.println(s2+ " is a palindrome? "+ fIndPalidrome.isPalidromeUseStream(s2));
        System.out.println(s3+ " is a palindrome? "+ fIndPalidrome.isPalidromeUseStream(s3));

    }
}
