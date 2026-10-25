package oop.inheritance.animal;

public class creature {
    //private子类就无法访问了 比如在public前面加private，那么子类就无法访问了。即子类只能访问父类中非私有成员

    public void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}
