package oop;
//标准的javaBean类
public class standard {
    private String userName;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参
    public standard(){

    }
    //全参构造
    public standard(String userName,String password,String email,String gender,int age){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //get和set 方法
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    //快捷键，alt + insert
    //选择构造方法/getter and setter;

}
