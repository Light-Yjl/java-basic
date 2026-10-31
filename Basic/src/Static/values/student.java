package Static.values;
//静态变量被该类的所有成员共享，不属于对象，属于类
public class student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;


    public student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void study(){
        System.out.println(this.name + " is studying");
    }

    public void show(){
        System.out.println(this.name +" " + this.age + " " + this.gender + " " + teacherName);
    }
}
