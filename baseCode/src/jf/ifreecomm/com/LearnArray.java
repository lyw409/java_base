package jf.ifreecomm.com;

import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {

        //定义数组的两种方式
        int[] nums = {1, 3, 4, 5};
        int[] otherNums = new int[3];
        int[] score = new int[6];
        System.out.println(nums.length);
        System.out.println(nums[0]);

        int[] test = {12, 4, 23, 6, 34, 76, 230, 5};
//        sortArray(test);
        bubbleSort(test);

        String[] str = reArr();
        System.out.println(str[2]);
        dimensionArr();

        learnParams(1,2,6,3,5);
    }

    //不定长参数...
    public static void learnParams(int a,int ... args){
        System.out.println("不定长参数："+Arrays.toString(args));
    }

    /*
    数组作为参数
     */
    public static void sortArray(int[] nums) {
        int sum = 0;
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }

        nums[0] = nums[maxIndex];
        nums[nums.length - 1] = nums[minIndex];

        System.out.println(nums[0] + "and " + nums[nums.length - 1]);
        System.out.println("total sum is " + sum);
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.print(arr[i] + "  ");
        }
//        System.out.println(Arrays.toString(arr));

    }

    public static String[] reArr() {
        String[] num = {"12", "i", "love", "u"};
        num[0] = "true";
        return num;
    }

    /*
    二维数组，可以理解为几行几列的列表
     */
    public static void dimensionArr() {
        int[][] arr = new int[3][2]; //规则的二维数组（3行2列）
        arr[0][0] = 3;
        arr[0][1] = 6;
        arr[1][0] = 46;
        arr[1][1] = 69;
        arr[2][0] = 26;
        arr[2][1] = 63;

        //二重循环遍历二维数组
        for(int i=0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        //不规则二维数组
        String[][] str = {{"i"},{"love","you"},{"hope","we","together"},{"alway","online"}};
        for(int i=0;i<str.length;i++){
            for (int j = 0;j<str[i].length;j++){
                System.out.print(str[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
