package jf.ifreecomm.com;

/**
 * 构造方法
 */
public class ConstructorMethod {
    public static void main(String[] args) {
        Dog dog = new Dog(); //只要有新创建的对象时，就会调用无参的构造函数
        dog.name = "小黑";
        dog.age = 3;
        dog.run();
        dog.show();

        Dog dog2 = new Dog("燕燕", 6); //此时会调用有参的构造函数
        dog2.show();
    }

}


class Dog {
    //成员属性
    String name;
    int age;

    //成员方法
    public void run() {
        System.out.println("狗狗正在跑。。。。。。");
    }

    public void show() {
        System.out.println("狗狗叫" + this.name + "==========狗狗" + this.age + "岁了");
    }

    /*
    构造方法与类名相同且没有返回值
    可以有多个构造方法，即构造方法的重载（必须有不同从参数）
     */
    public Dog() {
        System.out.println("调用了无参的构造方法");
    }

    public Dog(String name, int age) {
        System.out.println("调用了有参的构造方法");
        this.name = name;
        this.age = age;
    }

}
