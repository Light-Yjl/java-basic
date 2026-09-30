package control;
import java.util.Scanner;
public class if1 {
    public static void main(String[] args){
        demo3();
    }
    public static void demo1() {
        //if(关系表达式){
        //  语句体    }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量：");
        int wine = sc.nextInt();
        if(wine > 2){
            System.out.println("小伙子，不错！");
        }
    }

    public static void demo2(){
        /*
        如果对一个布尔类型的变量进行判断，不要用==号
        直接把变量写在关系表达式中
         */
//        boolean flag = false;
//        if(flag == true){
//            //如果是一个=相当于赋值
//            System.out.println("flag 的值为true");
//        }
        boolean flag = true;
        if (flag){
            System.out.println("flag 的值为true");
        }
    }
    public static void demo3(){
        //true 亮，false灭
        boolean green = false;
        boolean red = false;
        boolean yellow = true;
        if(green){
            System.out.println("go");
        }
        if(red){
            System.out.println("stop");
        }
        if(yellow){
            System.out.println("slow");
        }
    }
}
