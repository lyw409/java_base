/**
 * java里继承只能单继承
 */
package object.oriented.features;

public class AboutInherit {
    public static void main(String[] args) {
        Pupil p = new Pupil();
        p.play();
        p.learn();
        p.out();

    }
}

class People{
    public String name;
    protected int age;
    String sex;
    private String hobby;

    public People(){

    }

    public void out(){
        System.out.println("我是People类中的");
    }
}

//student类继承了People类
class College extends People{
    String subject;

    public void learn(){
        System.out.println("我是student类中的");
    }

}

class Pupil extends College{
    public void play(){
        System.out.println("我是pupil类");
    }
}
