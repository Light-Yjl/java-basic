package oop.Abstract;

public class students extends Person{
    public students() {
    }

    public students(String name, int age) {
        super(name, age);
    }

    @Override
    public void work(){
        System.out.println("我在工作");
    }
}
