package arrryList;

import java.util.ArrayList;
//增 add()
//删 remove(),(index) 返回是<>内类型的元素。("")返回布尔值
//改 set()
//查 get()
//size()
public class basic {
    public static void main(String[] args) {
        For();
    }
    public static void Add(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("1");
        list.add("num");

        System.out.println(list);
    }
    public static void Remove(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("1");
        list.add("num");
        boolean flag = list.remove("abc");
        String res = list.remove(0);
        System.out.println(list);
        System.out.println(flag);
        System.out.println(res);
    }
    public static void Set(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("1");
        list.add("num");

        String res = list.set(0,"hello"); //返回的是原来的值
        System.out.println(list);
        System.out.println(res);
    }

    public static void find(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("1");
        list.add("num");

        String res = list.get(0);
        System.out.println(res);
    }

    public static void Size(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("1");
        list.add("num");

        int num = list.size();
        System.out.println(num);
    }

    //遍历
    public static void For(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("1");
        list.add("num");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
