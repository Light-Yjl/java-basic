package arrryList;

import java.util.ArrayList;

public class addNumChar {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('1');
        list2.add('2');
        list2.add('s');
        System.out.println(list2);
    }
}
