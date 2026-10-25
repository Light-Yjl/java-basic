package string;

import java.util.Scanner;

//String substring(i,j)截取
//String replace('旧值','新值')


public class subAndReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = filterSensitiveWords(str);
        System.out.println(str2);

    }
    public static String maskNum(String phone){
        String start = phone.substring(0,3);
        String end = phone.substring(7);
        String res = start + "****" + end;
        return  res;
    }
    public static String extractIdentityInfo(String id){
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        String res = year + "年" + month + "月" + day + "日";
        return res;
    }
    public static String extractSexInfo(String id){
        int gender = id.charAt(16) - '0';
        String sex = "";
        if(gender % 2 == 0 ){
            sex = "女";
        }else{
            sex = "男";
        }
        return sex;
    }

    public static String filterSensitiveWords(String word){
        String[] arr = {"TMD","CNM","SB","ZP","MLGB"};
        String talk = word;
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i] ,"***");
        }
        return talk;
    }
}
