package ui.Test;

import java.util.Random;

public class setCaptcha {
    public static void main(String[] args) {
        String res = setCap();
        System.out.println(res);
    }
    public static String setCap(){
        char[] number = {'0','1','2','3','4','5','6','7','8','9'};
        char[] small = {'q','w','e','r','t','y','u','i','o','p',
                'a','s','d','f','g','h','j','k','l',
                'z','x','c','v','b','n','m'};
        char[] big = {'Q','W','E','R','T','Y','U','I','O','P',
                'A','S','D','F','G','H','J','K','L',
                'Z','X','C','V','B','N','M'};
        String res = "";
        char[] letter = new char[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int range = r.nextInt(3) ;
            if(range == 1){
                int index = r.nextInt(10);
                letter[i] = number[index];
            } else if (range == 2) {
                int index = r.nextInt(26) ;
                letter[i] = small[index];
            } else {
                int index = r.nextInt(26) ;
                letter[i] = big[index];
            }
        }
        for (int i = 0; i < letter.length; i++) {
            res += letter[i];
        }

        return res;

    }
}
