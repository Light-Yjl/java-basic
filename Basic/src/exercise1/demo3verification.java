package exercise1;
import java.util.Random;
public class demo3verification {
    public static void main(String[] args) {

//        //在没有规律的数据中随机抽取，可以把这些数据放在数组中
//        char [] arr = {'1','2','3','4','5','6','7','8','9','0','a','b','c','d','e','f','g','h','i','j','k',
//        'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E',
//        'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//        Random r = new Random();
//        char [] code = new char[5];
//        for (int i = 0; i < 5; i++) {
//            int index = r.nextInt(52) + 10;
//            if(i == 4){
//                index = r.nextInt(10);
//            }
//            code[i] = arr[index];
//        }
//
//        for (int i = 0; i < code.length; i++) {
//            System.out.print(code[i]);
//        }

        Random r = new Random();
        char[] code = new char[5];

        for (int i = 0; i < 4; i++) {
            int type = r.nextInt(2);
            if (type == 0) {
                // 大写 A~Z
                code[i] = (char)('A' + r.nextInt(26));
            } else {
                // 小写 a~z
                code[i] = (char)('a' + r.nextInt(26));
            }
        }

        // 最后一位 0~9
        code[4] = (char)('0' + r.nextInt(10));

        String res = "";
        for (int i = 0; i < code.length; i++) {
            res = res + code[i];
        }
        System.out.println(res);

    }
}
