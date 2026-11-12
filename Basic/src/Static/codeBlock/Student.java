package Static.codeBlock;

public class Student {
    private String name;
    private int age;

    static {
        //适用于做数据的初始化
        System.out.println("静态代码块执行力");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}