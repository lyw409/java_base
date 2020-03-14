package object.oriented.features.polymorphic.implement;

public class Cat extends Pet{
    String breed;
    public Cat(){

    }

    public Cat(String name,String sex,String breed){
        super(name,sex);
        this.breed = breed;
    }

    @Override
    public void show() {
        System.out.println("这是一只猫猫,它的名字叫"+name);
    }

    @Override
    public void play() {
        System.out.println(name+"它正在走猫步");
    }
}
