package arrryList.Class.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Users> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String id = sc.next();
            String name = sc.next();
            String password = sc.next();

            Users user = new Users(id,name,password);
            users.add(user);
        }

        System.out.println("请输入用户id");
        String Id = sc.next();
        boolean flag = contains(users,Id);
        String index = find(users,Id);
        System.out.println(flag);
        System.out.println(index);
    }

    public static boolean contains(ArrayList<Users> users , String Id){
        for (int i = 0; i < 3; i++) {
            if(users.get(i).getId().equals(Id)){
                return true;
            }
        }
        return false;
    }

    public static String find(ArrayList<Users> users,String Id){
        for (int i = 0; i < 3; i++) {
            if(users.get(i).getId().equals(Id)){
                return Id;
            }
        }
        return "-1";
    }
}
