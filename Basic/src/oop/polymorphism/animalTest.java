package oop.polymorphism;

public class animalTest {
    public static void main(String[] args) {
        Animal a = new dog();
        //多态的弊端，不能使用子类的特有功能,在调用方法时若主类没有，会报错，需要进行强转
        dog c = (dog) a;
        c.lookHome();

        //新特性，判断并强转
        if(a instanceof dog d){
            d.lookHome();
        } else if (a instanceof cat e) {
            e.catchMouse();
        }else{
            System.out.println("没有这个类型,无法转换");
        }
    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗在吃狗粮");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}

class cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫在吃小鱼干");
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
