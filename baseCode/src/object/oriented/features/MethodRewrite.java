/**
 * 方法重写，称为override
 * 子类中的方法，与父类中的方法的名称，参数列表，返回值类型一样，我们就说子类重写了父类的方法
 * <p>
 * 特点：
 * 在父子类中，方法名相同，参数列表相同，返回值类型相同或是子类
 * 访问修饰符不能缩小，即访问的权限不能缩小
 * 子类不能抛出比父类更大的异常
 * <p>
 * 作用： 用来重新定义子类的行为，解决父类和子类的差异性
 */
package object.oriented.features;

public class MethodRewrite {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat(); //如果不进行方法重写的话，两个新对象调用的父类的构造方法是一样的
        dog.Pet();
        cat.Pet();

    }

}

class Pet {
    public void Pet() {
        System.out.println("我是宠物我能叫。。。。");
    }
}

class Dog extends Pet {
    @Override
    public void Pet() {
        System.out.println("我是小狗我能汪汪汪。。。。");
    }

}

class Cat extends Pet {
    @Override
    public void Pet() {
        System.out.println("我是小猫我能喵喵喵。。。。");
    }
}
