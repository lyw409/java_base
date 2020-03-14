package jf.ifreecomm.com; /**
 * 传递参数
 */

import java.util.Arrays;

public class TranferValueDifferrent {
    public static void main(String[] args) {
        /*
        基本数据类型，值传递
         */
        int a = 2;
        int b = a;
        b = 6;
        System.out.println(a); //2
        System.out.println(b); //6

        /*
        引用数据类型，传递的是内存的首地址,
         */
        int[] arr1 = {12, 34, 5, 67};
        int[] arr2 = arr1; //将arr1的内存地址传递给arr2,本质上是指向同一块内存空间
        arr2[0] = 999;
        System.out.println(Arrays.toString(arr1));//[999, 34, 5, 67]
        System.out.println(Arrays.toString(arr2));//[999, 34, 5, 67]

        changValue(a, arr1);
        System.out.println(a);//2
        System.out.println(Arrays.toString(arr1));//[999, 34, 5, 409]
    }

    /*
    方法传参，与变量赋值时相同的
     */
    public static void changValue(int i, int[] arr) {
        i = 888;
        arr[arr.length - 1] = 409;
    }
}
