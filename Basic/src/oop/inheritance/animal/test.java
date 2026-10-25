package oop.inheritance.animal;

public class test {
    public static void main(String[] args) {
        ragDoll rd = new ragDoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println();

        liHua lh = new liHua();
        lh.eat();
        lh.drink();
        lh.catchMouse();

        System.out.println();


        System.out.println();

        husky h = new husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
