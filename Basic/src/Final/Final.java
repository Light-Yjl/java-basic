package Final;
/*
final 修饰方法是最终方法，不能被重写
final 修饰类表示该类是最终类，不能被继承
final 修饰变量表示该变量是常量，不能被修改

final 修饰的地址值不能被改变，但是属性值可以改变
 */

public class Final {
    public static void main(String[] args) {
         final Student s = new Student("张三",19);
         s.setName("李四");
         s.setAge(20);
         System.out.println(s.getName() + " " + s.getAge());
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}