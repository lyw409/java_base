package object.oriented.features.polymorphic.implement;

import java.util.Scanner;

public class ChoicePet {

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("======欢迎来到宠物店======");
        System.out.print("请选择您需要领养的宠物：(1.狗狗 2.猫猫)");
        int choice = input.nextInt();
        Pet pet = getPet(choice);
        pet.show();
        pet.play();

    }

    public static Pet getPet(int choice) {
        Pet pet = null;
        switch (choice) {
            case 1:
                pet = new Dog("可可", "母", "看电视");
                break;
            case 2:
                pet = new Cat("爱爱", "公", "波斯猫");
                break;
            default:
                System.out.print("输入有误，没有对应的宠物");
        }
        return pet;
    }
}
