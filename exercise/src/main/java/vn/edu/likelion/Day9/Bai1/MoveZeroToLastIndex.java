package vn.edu.likelion.Day9.Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * MoveZeroToLastIndex -
 *
 * @param
 * @return
 * @throws
 */
public class MoveZeroToLastIndex {

    /**
     *
     * @param arr
     */
    public void moveZeroToLast(int[] arr) {
        boolean swapper = false;
        for(int i = 0 ; i < arr.length-1 ;i++) {
            for (int j = 0 ; j < arr.length-i-1;j++) {
                int temp = 0;
                if (arr[j] ==0) {
                    temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapper =true;
            }
            }
            if (swapper ==false) {
                break;
            }
        }
    }

    public void moveZeroToLast1(int[] arr) {
        int i = 0;
        int j = 0;
        if (arr.length ==0 || arr.length ==1) return;
        while (i < arr.length) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else {
                i++;
            }
        }
    }

    public void moveZeroToLast2(int[] arr) {
       int count = 0 ;
       int[] tempArr = new int[arr.length];

       for (int i = 0 ; i<arr.length;i++) {
           if (arr[i] != 0 ){
               tempArr[count++] = arr[i];
           }
       }
        System.out.println(Arrays.toString(tempArr).replace(",","").replace("[", "").replace("]", ""));
    }


    public static void main(String[] args) {
        int [] arr = {0,0,1,0,3,0,5,0,6};
        int[] arr2 = {1,0,2,0,1};
         MoveZeroToLastIndex moveZeroToLastIndex = new MoveZeroToLastIndex();

       moveZeroToLastIndex.moveZeroToLast(arr2);
       moveZeroToLastIndex.moveZeroToLast2(arr2);

        int i;
        for (i =0; i<arr2.length;i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }
}
