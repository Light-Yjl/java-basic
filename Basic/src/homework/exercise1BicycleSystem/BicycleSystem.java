package homework.exercise1BicycleSystem;

import java.util.Scanner;

import static homework.exercise1BicycleSystem.SystemManage.*;

public class BicycleSystem {
    public static void main(String[] args) {
        SystemManage.create();
        loop: while(true) {
            System.out.println("********校园共享单车管理系统********\n" +
                    "\n" +
                    "1. 查看所有单车\n" +
                    "2. 查询可用单车\n" +
                    "3. 租借单车\n" +
                    "4. 归还单车\n" +
                    "5. 查看租借记录\n" +
                    "6. 退出系统\n" +
                    "\n" +
                    "请选择：");

            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();

            switch (choose) {
                case 1 -> {
                    checkAllBikes();
                }
                case 2 -> {
                    checkCanBikes();
                }
                case 3 -> {
                    rentBikes();
                }
                case 4 -> {
                    returnBikes();
                }
                case 5 -> {
                    checkRecords();
                }
                case 6 -> {
                    System.out.println("感谢使用校园共享单车管理系统！");
                    break loop;
                }
            }
        }


    }



}
