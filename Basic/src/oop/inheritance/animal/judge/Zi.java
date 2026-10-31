package oop.inheritance.animal.judge;

public class Zi extends Fu{
    String game = "game";
    String name = "Zi";
    public Zi() {
    }

    public void ziShow1(){
        //成员变量的访问特点，就近原则
        System.out.println(name);
        System.out.println(game);
        System.out.println(this.name);
        System.out.println(this.game);
        System.out.println(this.age);
        System.out.println(super.name);
        System.out.println(super.age);
    }

}
