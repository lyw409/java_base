package jf.ifreecomm.com;

/**
 * 学习this关键字
 * 定义类
 * static关键字
 * 变量的范围：全局变量和局部变量
 * 变量的类型：静态变量和实例变量
 */
public class CurrentClassObject {
    public static void main(String[] args) {
        //新建一个实例
        Student my = new Student();
        my.name = "liulu";

        //这里的age是静态变量（属于某个类而不是某个实例），需要用类名去访问
//        my.age ="28";
        Student.age = "16"; //推荐的静态变量的访问方式

        //调用实例方法
        my.show();
        my.outPutObj();
        Student.add("这个是类调用的，因为是add是静态方法");

        Student he = new Student();

        he.name = "贾波波";
        he.outPutObj();


    }


}

//定义一个类
class Student {
    String name; //实例属性
    static String age; //静态属性

    public void show() {  //实例方法
        System.out.println("我的名字是" + name); //实例可以访问实例变量和静态变量，静态方法和实例方法
        add("是show调用的吧");
    }

    public static void add(String item) {  //静态方法
//        System.out.println("我的名字是"+name); //会报错，静态方法只能访问静态变量和方放
        System.out.println("我的名字是" + age + item);

    }


    //关于this关键字，主要是代表调用方法的对象
    public void outPutObj() {
        String name = "leeyowon";
        System.out.println("我是局部变量在方法内定义的" + name);
        System.out.println("我是取决于调用我的对象" + this.name);
    }

}