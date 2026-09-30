package control;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        /*
        switch{
        case 表达式1:
            语句体1;
            break;
        case 表达式2:
            语句体2;
            break;
        case 表达式3:
            语句体3;
            break;
            ...
        default:
            语句体 n + 1 ;
            break;
        }
         */

        demo7();
    }

    public static void demo1(){

        String noodles = "海鲜龙虾面";
        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
        }
    }

    public static void demo2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();
        switch (week){
            case 1 :
                System.out.println("run");
                break;
            case 2 :
                System.out.println("swim");
                break;
            case 3 :
                System.out.println("walk");
                break;
            case 4 :
                System.out.println("bike");
                break;
            case 5 :
                System.out.println("beat");
                break;
            case 6 :
                System.out.println("climb");
                break;
            case 7 :
                System.out.println("eat yummy food!!!!!!");
                break;
        }
    }

    public static void demo3(){
        /*
        default 可以省略但不建议省略
        一般写在最下面
         */

        /*
        case 穿透:如果没有break，所有 case 语句都会被执行.遇到break或者右大括号停止。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("run");
                //break;
            case 2:
                System.out.println("swim");
                //break;
            case 3:
                System.out.println("walk");
                //break;
            case 4:
                System.out.println("bike");
                //break;
            case 5:
                System.out.println("beat");
                //break;
            case 6:
                System.out.println("climb");
                //break;
            case 7:
                System.out.println("eat yummy food!!!!!!");
                //break;
        }
    }

    public static void demo4(){
        //jdk11新特性
        int num = 1;
        switch (num){
            case 1 ->{
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            case 3 ->{
                System.out.println("三");
            }
            default ->{
                System.out.println("无");
            }
        }
    }

    public static void demo5(){
        //jdk12新特性
        int num = 1;
        switch (num){
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("无");
        }
    }

    public static void demo6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几：");
        int day = sc.nextInt();
        switch (day){
            case 1 ,2 ,3 ,4 ,5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("无");
        }
    }

    public static void demo7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择一个整数");
        int type = sc.nextInt();
        switch (type){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }


}















