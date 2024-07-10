package vn.edu.likelion.Day18;

import java.util.Arrays;

/**
 * MergeSort -
 *
 * @param
 * @return
 * @throws
 */
public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {5,2,3,4};
        int left = 0 ;
        int right = arr.length -1;
        Arrays.toString(arr);

        System.out.println(Arrays.toString(arr));
    }

    public int[] sortArray(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        sort(nums,left,right);
        return nums;
    }

    private static void sort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) /2;

            sort(arr,left , mid);

            sort(arr,mid +1,right);

            mergeSort(arr,left,mid,right);
        }
    }

    private static void mergeSort(int[] arr, int left, int mid, int right) {

        int n1 = mid - left +1;
        int n2 = right - mid;

        int N1[] = new int[n1];
        int N2[] = new int[n2];



        for (int i = 0 ; i < n1 ; i++) {
            N1[i] = arr[left + i];
        }

        for (int j = 0 ; j < n2 ; j++) {
            N2[j] = arr[mid + j +1];
        }

        int i = 0 ;
        int j = 0 ;

        int k = left;
        while (i < n1 && j < n2) {
            if (N1[i] <= N2[j]) {
                arr[k] = N1[i];
                i++;
            }else {
                arr[k] = N2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = N1[i];
            i++;
            k++;
         }
        while (j < n2) {
            arr[k] = N2[j];
            j++;
            k++;
        }

    }
}
