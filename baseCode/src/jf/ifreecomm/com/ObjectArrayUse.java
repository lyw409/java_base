package jf.ifreecomm.com; /**
 * 对象数组的学习
 */
import jf.ifreecomm.com.Car;
import java.util.Scanner;

public class ObjectArrayUse {
    public static void main(String[] args) {
        Car[] cars = new Car[3]; //初始化长度为3的对象数组
        inputCarIfo(cars);
        displayCarIfo(cars);
    }

    /**
     * 输入车辆信息
     * @param cars
     */
    public static void inputCarIfo(Car[] cars){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<cars.length;i++){
            cars[i]= new Car();
            System.out.println("===========请输入第"+ (i+1)+"辆车的信息==============");
            System.out.println("请输入名称：");
            cars[i].name = input.next();
            System.out.println("请输入颜色：");
            cars[i].color = input.next();
            System.out.println("请输入速度：");
            cars[i].speed = input.nextInt();
            System.out.println("请输入价格：");
            cars[i].price = input.nextDouble(); //这里应该对应类型，不然会报错
        }
    }

    /**
     * 显示车辆信息
     * @param cars
     */
    public  static void displayCarIfo(Car[] cars){
        System.out.println("名称\t颜色\t速度\t价格");
        for(Car car:cars){
            System.out.println(car.name+"\t"+car.color+"\t"+car.speed+"\t"+car.price);
        }

    }
}
