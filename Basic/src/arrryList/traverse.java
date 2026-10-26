package arrryList;

import java.util.ArrayList;
import java.util.Scanner;

public class traverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String str = sc.next();
            list.add(str);
        }
        System.out.print("[");

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i) + "]");
            }else{
                System.out.print(list.get(i) + ",");
            }

        }
    }
}
