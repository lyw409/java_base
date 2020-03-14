package object.oriented.features.polymorphic.implement;

public class Master {
    String name;

    public Master(){

    }

    public Master(String name){
        this.name = name;
    }

    //将父类作为方法的形参
    public void play(Pet pet){ //将父类的引用作为方法形参，减少代码，更具有扩展性
        pet.play();
    }

    public void feed(Pet pet,Food food){
        System.out.println("主人给"+pet.name+"喂"+food.name);
    }
}

