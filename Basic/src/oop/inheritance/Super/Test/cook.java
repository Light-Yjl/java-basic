package oop.inheritance.Super.Test;

public class cook extends emp{
    public cook() {
    }

    public cook(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println(this.getName() + "在炒菜");
    }
}
