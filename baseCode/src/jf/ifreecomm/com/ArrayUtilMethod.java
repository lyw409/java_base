package jf.ifreecomm.com; /**
 * 关于数组工具内的方法
 */

import java.util.Arrays;

public class ArrayUtilMethod {
    public static void main(String[] args) {
        int[] nums = {1,5,2,8,3,9};
        /*
        toString
         */
        System.out.println(Arrays.toString(nums));

        /*
        sort
         */
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        /*
        fill
         */

        Arrays.fill(nums,6);
        System.out.println(Arrays.toString(nums));
    }
}
