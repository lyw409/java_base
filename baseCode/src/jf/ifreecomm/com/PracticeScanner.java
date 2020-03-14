package jf.ifreecomm.com; /**
 * 引入Scanner对象
 */

import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("please input your score:");
//        int score = input.nextInt();
//        if (score>90) {
//            System.out.println("You are so good");
//        } else {
//            System.out.println("study");
//        }
//        doSum();
//        useParams(3,4) ;
       int sum = doAdd(1,2);
//       System.out.println(sum+1);
       System.out.println(doJoin("I love you"));
    }

    /*
     use method
     */
    public static void doSum(){
        for(int i= 1;i<5;i++){
            System.out.println("output"+i);
        }
    }

    /*
    transfer params
     */
    public static void useParams(int start,int end){
        int sum = start + end;
        System.out.println("sum="+sum);
    }

    /*
    use return and define type
     */

    public static int doAdd(int a,int b){
        return a+b;
    }

    public static String doJoin(String src){
        return src+"520";
    }
}
