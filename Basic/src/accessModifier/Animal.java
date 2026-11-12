package accessModifier;

public class Animal {
    protected String name;

    public void show(){
        System.out.println(name);
    }
}

class a extends Animal{
    public void show1(){
        System.out.println(name);
    }
}