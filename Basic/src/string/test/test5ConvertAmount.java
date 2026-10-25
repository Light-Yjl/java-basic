package string.test;

import java.util.Scanner;

public class test5ConvertAmount {
    public static void main(String[] args) {
        char[] Big = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        char[] res = {'零','佰','零','拾','零','万','零','仟','零','佰','零','拾','零','元'};
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int j = 0;
        for (int i = num.length() - 1 ; i >= 0; i--) {
            res[res.length - 2 * j - 2] = Big[num.charAt(i) - '0'];
            j++;
        }
        String result = new String(res);
        System.out.println(result);
    }
}
