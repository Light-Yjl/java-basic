package string.test;

import java.util.Scanner;

public class test1UserLogin {
    public static void main(String[] args) {
        //模拟用户登录
        //定义正确的用户名和密码
        String rightName = "zhangsan";
        String rightPassword = "123456";
        boolean res = false;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(!res) {
            String name = sc.next();
            String password = sc.next();
            count ++;
            boolean res1 = name.equals(rightName);
            boolean res2 = password.equals(rightPassword);
            if(res1 && res2){
                res = true;
                System.out.println("登陆成功");
            }else if(res1 && !res2){
                System.out.println("密码错误");
            }else{
                System.out.println("用户名和密码错误");
            }
            if(count == 3){
                res = true;
                System.out.println("登录次数过多，请稍后尝试");
            }

        }

    }
}
