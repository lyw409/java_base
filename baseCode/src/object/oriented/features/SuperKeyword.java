/**
 * super关键字
 * 表示父类对象的引用只能在子类中使用
 * 可以使用super调用父类的构造方法，但是必须放在第一行
 * 可以使用super. 访问父类的属性和方法，解决父类和子类中成员同名问题
 * <p>
 * this关键字
 * 表示当前对象的引用只能在方法中使用
 * 可以使用this()访问当前类中重载的构造方法，必须位于第一行
 * 可以使用this.访问本类中的属性和方法，解决全局变量和局部变量同名的变量
 * <p>
 * ！注意！调用构造方法时this()和super()都只能放在第一行，所以不能同时使用
 */
package object.oriented.features;

public class SuperKeyword {
    public static void main(String[] args) {
        //新创建一个对象时的调用顺序
//        父父类中的无参构造方法。。。
//        父类中的无参构造方法。。。
//        子类中的无参构造方法。。。
        Children child = new Children("纯牛奶","大白兔");
        child.single  = false;
    }

}

class Grandfather {
    String name;
    int age;
    boolean single;

    public Grandfather() {
        System.out.println("父父类中的无参构造方法。。。" +single);
    }

    public Grandfather(String name, int age, boolean single) {
        this.name = name;
        this.age = age;
        this.single = single;
        System.out.println("父父类中的有参构造方法。。。");
    }

}

class Parent extends Grandfather {
    String hobby;
    String food;
    boolean single;

    public Parent() {
        System.out.println("父类中的无参构造方法。。。");
    }

    public Parent(String hobby, String food,boolean single) {
        this.hobby = hobby;
        this.food = food;
        this.single = single;
        System.out.println("父类中的有参构造方法。。。" +single);
    }

}

class Children extends Parent {
    String milk;
    String sugar;

    public Children() {
        System.out.println("子类中的无参构造方法。。。");
    }

    public Children(String milk, String sugar) {
        super("做游戏","甜食",true); //super调用父类的构造方法，但是必须放在第一行
        this.milk = milk;
        this.sugar = sugar;
        System.out.println("子类中的有参构造方法。。。");
    }

}
