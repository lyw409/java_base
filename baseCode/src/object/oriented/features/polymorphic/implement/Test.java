/**
 * 多态的实现
 * 将父类作为方法的形参，将子类的对象作为方法的实参，从而实现多态
 *
 *案例：主人与宠物，玩耍，喂养
 * 主人类：Master
 * 宠物 Pet ->Dog Cat
 * 食物 Food ->Bone Fish
 */
package object.oriented.features.polymorphic.implement;

public class Test {
    public static void main(String[] args) {
        Master lee = new Master();

        Dog dog = new Dog("旺财","公的","啃骨头");
        Bone bone = new Bone("猪肉大骨头");
        //将子类的对象作为方法的实参
        lee.play(dog);
        lee.feed(dog,bone);

        Cat cat = new Cat("小花","母的","加菲猫");
        Fish fish = new Fish("巴沙鱼");
        lee.play(cat);
        lee.feed(cat,fish);





    }

}
