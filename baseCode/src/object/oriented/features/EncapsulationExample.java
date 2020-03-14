/**
 * 练习封装
 * 定义一个Programmer程序员类，包含如下的属性和方法
 * 属性：姓名，年龄，技术方向
 * 方法：自我介绍，工作
 * <p>
 * 要求：
 * 1.对属性进行封装，并提供getter/setter方法
 * 2.限制年龄必须大于18岁，否则提示年龄无效，并设置为默认年龄18
 * 3.技术方向为只读，通过构造方法初始化
 */
package object.oriented.features;

public class EncapsulationExample {
    public static void main(String[] args) {
        Programmer person = new Programmer("LYW", 24, "java");
        person.selfIntroduct();
    }

}

class Programmer {
    private String name;
    private int age;
    private String skill;

    //构造方法在一般方法前
    public Programmer() {
    }

    public Programmer(String name, int age, String skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("年龄无效，已修改为默认值");
            this.age = 18;
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public int getAge() {
        return age;
    }


    public void selfIntroduct() {
        System.out.println("我叫" + this.name + "我" + this.age + "岁了" + "我擅长" + this.skill);
    }

}
