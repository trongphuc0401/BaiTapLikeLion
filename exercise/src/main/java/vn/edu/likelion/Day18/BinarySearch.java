package vn.edu.likelion.Day18;

import java.util.Arrays;

/**
 * BinarySearch -
 *
 * @param
 * @return
 * @throws
 *
 * 1. Tìm phần tử ơr giữa
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,45,52,12,3,12,312,2122,31};
        int x =2;
        Arrays.sort(arr);

        System.out.println( x +"x"+ binarySearch1(arr,x));


    }
    public static int binarySearch1(int[] arr, int x) {
        // Xác định phạm vi tìm kiếm từ index: 0 đến arr.length-1

        int left = 0;
        int right = arr.length -1;

        // sử dụng vòng lặp từ left qua right tới khi không còn gì để lặp

        while(left <= right) {
            // lấy phần tử ở giữa mảnhg

            int mid = (left+right)/2;

            // so sánh giá trị cần tìm vs phần tử ở giữa
            if (arr[mid] ==x) {
                return mid;
            }
            // nếu phần từ cần tìm nhỏ hơn ở giữa thì tìm bên trái
            if (arr[mid] > x) {
                right = mid -1;
            }
            else{
                // nếu phàn tử cần tìm lớn hơn ở giữa
                left= mid +1;
            }

        }
        return -1;

    }
}
