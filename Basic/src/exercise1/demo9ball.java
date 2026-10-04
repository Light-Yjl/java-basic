package exercise1;
import java.util.Scanner;
import java.util.Random;
public class demo9ball {
    public static void main(String[] args) {
        int[] result = generateNumbers();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        int[] input = inputNumbers();
        int price = compare(result, input);
        System.out.println(price);

    }

    public static int[] generateNumbers() {
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i < numbers.length; ) {
            if (i < 6) {
                numbers[i] = r.nextInt(33) + 1;
                boolean flag = contains(numbers, i);
                if (!flag) i++;
            } else {
                numbers[i] = r.nextInt(16) + 1;
                i++;
            }
        }
        return numbers;
    }

    public static boolean contains(int[] numbers, int index) {
        for (int i = 0; i < index; i++) {
            if (numbers[i] == numbers[index]) {
                return true;
            }
        }
        return false;
    }


    public static int[] inputNumbers() {
        int[] input = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static int compare(int[] numbers, int[] input) {
        int red = 0;
        boolean blue = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = input.length - 2; j >= 0; j--) {
                if (numbers[i] == input[j]) {
                    red++;
                }
            }
        }
        if (numbers[6] != input[6]) blue = false;
        int price = 0;
        if (blue) {
            if (red == 0 || red == 1 || red == 2) return 5;
            if (red == 3) price = 10;
            if (red == 4) price = 200;
            if (red == 5) price = 3000;
            if (red == 6) price = 10000000;
        } else {
            if (red == 4) price = 10;
            if (red == 5) price = 200;
            if (red == 6) price = 5000000;
        }
        return price;
    }
}

    /*
    public static int getPrice(int red, boolean blue) {
        if (red == 6) return blue ? 10000000 : 5000000;
        if (red == 5) return blue ? 3000 : 200;
        if (red == 4) return blue ? 200 : 10;
        if (red == 3 && blue) return 10;
        if (red <= 2 && blue) return 5;

        return 0;
    }
    public static int compare1(int[] numbers, int[] input) {
        int red = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = input.length - 2; j >= 0; j--) {
                if (numbers[i] == input[j]) {
                    red++;
                }
            }
        }

        boolean blue = numbers[6] == input[6];

        return getPrice(red, blue);
    }

     */



//刚开始自己写的这版缺少判断生成的中奖数字是否重复。后面添加了一个contains代码。else里面也缺少了一个i++，
//不然循环没办法结束。问gpt又优化了一版新的，把compare方法分成getPrice和compare两个代码，更简洁了。
