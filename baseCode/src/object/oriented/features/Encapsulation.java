/**
 * 封装
 */
package object.oriented.features;

public class Encapsulation {
    public static void main(String[] args) {
        Student stu = new Student();
//        stu.name = "liulu"; //因为在Student类中定义的变量是私有的，在非同类中不能访问，所有需要通过公有的方法访问
        stu.setName("leeyowon");
        stu.setHobby("travel");
        stu.setGraduation(true);
        String grad = stu.isGraduation() ?"是的":"没有";
       System.out.println(stu.getName() + "喜欢"+stu.getHobby()+"她毕业了吗"+grad);
    }

}

class Student{
    private String name;

    //私有属性的获取方法（getter）
    public String getName() {
        return name;
    }

    //私有属性的编辑方法(setter)
    public void setName(String name) {
        this.name = name;
    }



    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    private String hobby;

    //如果是布尔值类型的话，获取方法命名规范最好是isXxx;
    private boolean graduation;

    public boolean isGraduation() {
        return graduation;
    }

    public void setGraduation(boolean graduation) {
        this.graduation = graduation;
    }

    //构造方法
    public Student(){

    }







}
