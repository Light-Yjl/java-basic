package exercise1;

public class demo2prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;//跳出单层循环
                }
            }
            if(flag) {
                count++;
                System.out.println(i + "是质数" );
            }

        }
        System.out.println(count);

    }
}
