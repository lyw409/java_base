package object.oriented.features.polymorphic.implement;

public class Dog extends Pet{
    String hobby;
    public Dog(){

    }

    public Dog(String name,String sex,String hobby){
        super(name,sex);
        this.hobby = hobby;
    }

    @Override
    public void show() {
        System.out.println("这是一只狗狗,它的名字叫"+name);
    }

    @Override
    public void play() {
        System.out.println(name+"它正在接飞盘");
    }

}
