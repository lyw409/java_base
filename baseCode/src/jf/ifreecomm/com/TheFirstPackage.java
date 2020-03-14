/**
 * 包的学习：
 * 使用包 package 包名；包名必须小写；
 * 必须在第一行除注释外；
 * 当使用其他包的类时，必须先导入  import 包名.类名 或包名.* （*号表示所有的类）
 *导入包必须在声明包的下面！
 * Java中常用的包；
 * java.lang  最常用的包，自动导入所有的
 * java.io 输入输出的包
 * java.util 工具类
 * java.sql 数据库
 * java.net 网络操作
 * java.awt 图型窗口操作
 *
 *
 * 注意！！！需要先定义包，才能新建类，不能将类直接写在src下
 */
package jf.ifreecomm.com;

import java.util.Arrays;
import java.util.Scanner;

public class TheFirstPackage {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String[] names = new String[3];
        names[0] = "234";
        System.out.println(Arrays.toString(names));
    }

}
