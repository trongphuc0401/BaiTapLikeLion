package vn.edu.likelion.Day18;

import java.util.Arrays;

/**
 * QuickSort -
 *
 * @param
 * @return
 * @throws
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {10,17,18,12,114,42,1,2,52};
        int left = 0;
        int right = arr.length -1;
        System.out.println(Arrays.toString(arr));
        quicksort(arr,left,right);
        System.out.println(Arrays.toString(arr));

    }


    public static void quicksort(int[] arr,int left, int right) {

        if (left < right) {
            int pa = partition(arr,left,right);

            quicksort(arr,left,pa-1);
            quicksort(arr,pa+1,right);
        }
        // đệ quy


    }
    public static int  partition(int[] arr,int left,int right) {

        int pivot = arr[right];
        int pv  = left -1;

        for(int i = left ; i < right ; i++) {

            if (arr[i] <= pivot) {
                pv++;
                int temp = arr[pv];
                arr[pv] = arr[i];
                arr[i] =temp;
            }
        }
        int temp = arr[pv +1];
        arr[pv +1] = arr[right];
        arr[right] = temp;
        return pv+1;
    }
}
