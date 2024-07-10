package vn.edu.likelion.Day18;

/**
 * BubbleSort -
 *
 * @param
 * @return
 * @throws
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2,5};


    }

    public void sort(int [] arr) {
        for(int i = 0 ; i < arr.length -1; i++) {

            for(int j = 0 ; j < arr.length -1 -i;j++) {
                int temp = 0;
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
