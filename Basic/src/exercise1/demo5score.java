package exercise1;
import java.util.Scanner;
public class demo5score {
    public static void main(String[] args) {
        int [] scores = getScore();
        int sum = getSum(scores);
        int max = getMax(scores);
        int min = getMin(scores);
        double res = (sum - max - min) * 0.25;
        System.out.println(res);
    }

    private static int[] getScore() {
        int [] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            int sco = sc.nextInt();
            if(sco >= 0 && sco <= 100) {
                scores[i] = sco;
                i++;
            }else{
                System.out.println("分数有误请重新输入");
            }
        }
        return scores;
    }

    private static int getMin(int[] score) {
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] < min) min = score[i];
        }
        return min;
    }

    private static int getMax(int[] score) {
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) max = score[i];
        }
        return max;
    }

    public static int getSum(int [] score){
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }
}
