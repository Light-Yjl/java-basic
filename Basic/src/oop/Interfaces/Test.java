package oop.Interfaces;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("小白兔",3);
        Frog f = new Frog("小青蛙",2);
        Dog d = new Dog("小金毛",3);
        r.eat();
        f.eat();
        f.swim();
        d.eat();
        d.swim();

    }
}
