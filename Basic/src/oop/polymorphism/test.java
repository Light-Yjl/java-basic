package oop.polymorphism;

public class test {
    public static void main(String[] args) {
        students s = new students();
        s.setName("张三");
        s.setAge(18);

        teachers t = new teachers();
        t.setName("王芳");
        t.setAge(30);

        administrator ad = new administrator();
        ad.setName("刘翔");
        ad.setAge(22);

        register(s);
        register(t);
        register(ad);
    }
    public static void register(person p){
        p.show();
    }
}
