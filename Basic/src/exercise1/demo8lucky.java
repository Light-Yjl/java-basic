package exercise1;
import java.util.Random;
public class demo8lucky {
    public static void main(String[] args) {
        int [] reward = {2,588,888,1000,10000};
        int [] lucky = luckyDraw(reward);
        for (int i = 0; i < lucky.length; i++) {
            System.out.println(lucky[i] + "元的奖金被抽出");
        }
    }

    public static int[] luckyDraw(int [] reward){
        Random r =new Random();
        for (int i = 0; i < reward.length; i++) {
            //保证不再抽取前面已经抽到的
            int index = r.nextInt(reward.length - i) + i;
            int temp = reward[i];
            reward[i] = reward[index];
            reward[index] = temp;
        }

        return reward;
    }
}
