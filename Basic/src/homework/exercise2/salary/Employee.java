package homework.exercise2.salary;

public class Employee {
    private String name;
    private int base;

    public Employee() {

    }

    public Employee(String name, int base) {
        this.name = name;
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public long getPay(){
        return getBase();
    }
}
