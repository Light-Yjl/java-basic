package oop;

public class BoyFriendTest {
    public static void main(String[] args) {
        //构造器的定义方法
        BoyFriend by = new BoyFriend("Light",18,"高冷",189.5,159.5); //调用的空参构造
        //原来的定义方法
        by.name = "Light";
        by.setAge(18);
        by.gender = "高冷黑发男";
        by.setHeight(189.5);
        by.weight = 150.5;

        System.out.println(by.name);
        System.out.println(by.getAge());
        System.out.println(by.gender);
        System.out.println(by.getHeight());
        System.out.println(by.weight);

        by.sleep();
        by.eat();
        by.playGame();

        System.out.println("==========================");
        //构造器的定义方法
        BoyFriend by2 = new BoyFriend("Night",19,"阴湿腹黑男",187.5,147.5);
        //原来的定义方法
        by2.name = "Night";
        by2.setAge(19);
        by2.gender = "阴湿腹黑男";
        by2.setHeight(187.5);
        by2.weight = 147.5;

        System.out.println(by2.name);
        System.out.println(by2.getAge());
        System.out.println(by2.gender);
        System.out.println(by2.getHeight());
        System.out.println(by2.weight);

        by2.sleep();
        by2.eat();
        by2.playGame();
    }
}
