package oop.inheritance.Super.Test;

public class Main {
    public static void main(String[] args) {
        manager m = new manager("p01","jan",15000,8000);
        cook c = new cook("p02","cooker",6000);
        m.work();
        c.work();
        m.eat();
        c.eat();
    }
}
