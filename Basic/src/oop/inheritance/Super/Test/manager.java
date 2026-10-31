package oop.inheritance.Super.Test;

public class manager extends emp{
    private int manageSalary;

    public manager(){
    }

    public manager(int manageSalary) {
        this.manageSalary = manageSalary;
    }

    public manager(String id, String name, int salary, int manageSalary) {
        super(id, name, salary);
        this.manageSalary = manageSalary;
    }

    public int getManageSalary() {
        return manageSalary;
    }

    public void setManageSalary(int manageSalary) {
        this.manageSalary = manageSalary;
    }

    @Override
    public void work(){
        System.out.println(this.getName() + "在管理其他人");
    }

}
