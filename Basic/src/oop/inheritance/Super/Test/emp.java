package oop.inheritance.Super.Test;

public class emp {
    private String id;
    private String name;
    private int salary;

    public emp() {
    }

    public emp(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(this.name + "在工作");
    }

    public void eat(){
        System.out.println(this.name + "在吃饭");
    }
}
