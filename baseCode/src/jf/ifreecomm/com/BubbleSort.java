package jf.ifreecomm.com; /**
 * 冒泡排序
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 0, 4, 13, 2, 45};
        bubbleSortFun(arr);
    }

    public static void bubbleSortFun(int[] arr) {
        int temp;
        //外层循环控制比较的轮数
        for (int i = 0; i < arr.length-1; i++) {
            //控制每轮比较的次数
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
