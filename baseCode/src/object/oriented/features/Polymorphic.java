/**
 * 多态
 */
package object.oriented.features;

public class Polymorphic {
    public static void main(String[] args) {
        Person person = new Teacher(); //向上转型
        person.name = "liulu";
        person.show(); //此时调用的是父类指向子类中的方法（被子类重写过的方法）
//        person.school = "西安邮电大学"; 此时在这里调用是会报错的
//        person.teach();

        //需要进行强制类型转换
        //向下转型
        Teacher tor = (Teacher) person;
        tor.school = "西安邮电大学";
        tor.teach(); //此时调用是正常的

        //在做强制类型转换前是需要做判断的，使用instanceof 操作符
        //避免转换时不是真实的指向
        if (person instanceof Doctor) { //如果没有加这个判断会报ClassCastException，类型转换异常
            Doctor doc = (Doctor) person;
            doc.hospital = "西丽医院";
            doc.operate();
        }

    }

}

class Person {
    String name;

    public void show() {
        System.out.println("我叫" + name + "我是一个人");
    }

}

class Teacher extends Person {
    String school;

    //重写了父类的方法
    @Override
    public void show() {
        System.out.println("我叫" + name + "我是一名老师");
    }

    public void teach() {
        System.out.println("我在" + school + "正在上课");
    }

}

class Doctor extends Person {
    String hospital;

    @Override
    public void show() {
        System.out.println("我叫" + name + "我是一名老师");
    }

    public void operate() {
        System.out.println("我在" + hospital + "正在做手术");
    }

}
