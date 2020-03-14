/**
 * 访问修饰符
 * public 在哪都能使用
 * protected 只有不同包并且非子类不能访问，其他都可以访问
 * 默认 只有本包才可以访问
 * private 只有本类才可以访问
 *
 * 范围从大到小顺序：public > protected > 默认> private
 */
package my.first.com;
import jf.ifreecomm.com.Car;

public class VisitRangeSymbol {
    public String sex;
    protected String height;
    String width;
    private String weight;

    //不同类同一个包下，只有private修饰的不可以访问
    public static void main(String[] args) {
        Fruit fit = new Fruit();
        fit.name = "apple";
        fit.color = "red";
        fit.age = "1";
//        fit.size = "80"; //在这里是无法调用size的，因为它是由private修饰的，范围是同一个类
    }

    //同一个类里不管什么修饰符都是可以访问的
    public static void modifySymbol() {
        VisitRangeSymbol sym = new VisitRangeSymbol();
        sym.sex = "man";
        sym.height = "180";
        sym.width = "200";
        sym.weight = "49";
    }

    //不同包,非子类,只有public修饰的可以访问，其他的都不行
    public void otherPackage(){
        Car car = new Car();
        car.book = "js";
        car.adjustSymbol();
    }

}

class Fruit {
    public String name;
    protected String age;
    String color;
    private String size;
}
