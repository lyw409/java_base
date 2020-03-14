package jf.ifreecomm.com; /**
 * 数组的基本练习
 */

import java.util.Arrays;

public class DefineArrayFun {
    public static void main(String[] args) {
        int[] nums = {1, 7, 0, 9, 4, 2};
        int[] num2 =  new int [nums.length]; //需要定义一个和nums数组长度一样的
        copyArray(nums,num2);
        outputArray(nums);
        printArray(nums);
        changeItem(nums,0,2);
        reverseArray(nums);
    }

    //实现复制功能，参数：原数组，目标数据
    public static void copyArray(int[] originArr, int[] destArr) {
        for (int i = 0; i < originArr.length; i++) {
            destArr[i] = originArr[i];
        }
        System.out.println(Arrays.toString(destArr));
    }

    //实现输出数组中的元素以短横线输出
    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }

    }

    //实现倒序输出数组中的元素
    public static void printArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }

    }

    //实现交换数组中两个元素
    public static void changeItem(int[] array, int a, int b) {
        int aInx = 0;
        int bInx = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                aInx = i;
            }
            if (b == array[i]) {
                bInx = i;
            }
        }

        temp = array[bInx];
        array[bInx] = array[aInx];
        array[aInx] = temp;
        System.out.println("交换元素：" + Arrays.toString(array));
    }

    //实现数组中的元素反转
    public static void reverseArray(int[] array) {
        int temp;
        for(int i = 0;i<array.length/2;i++){
            int j = array.length-1-i;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
      System.out.println("反转数组："+Arrays.toString(array));
    }
}
