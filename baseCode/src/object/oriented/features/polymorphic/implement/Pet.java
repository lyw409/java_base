package object.oriented.features.polymorphic.implement;

public class Pet {
    String name;
    String sex;

    public Pet() {

    }

    public Pet(String name, String sex) {
        super();
        this.name = name;
        this.sex = sex;
    }

    public void show (){
        System.out.println("这是一只宠物");
    }

    public void play(){
        System.out.println("宠物正在玩耍");
    }

}

