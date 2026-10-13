package homework.exercise1BicycleSystem;

import java.util.Scanner;

public class SystemManage {
    private static SharedBikes bike1;
    private static SharedBikes bike2;
    private static SharedBikes bike3;
    private static SharedBikes bike4;
    private static SharedBikes bike5;
    private static SharedBikes bike6;
    private static SharedBikes bike7;
    private static SharedBikes bike8;

    private static RentalRecord[] records = new RentalRecord[1000];
    private static int recordCount;
    //定义5个共享单车
    public static void create(){
        bike1 = new SharedBikes("001","普通车","图书馆","可用",
                2);
        bike2 = new SharedBikes("002","电动车","宿舍楼下","可用",
                5);
        bike3 = new SharedBikes("003","普通车","教学楼","可用",
                2);
        bike4 = new SharedBikes("004","普通车","宿舍楼下","可用",
                2);
        bike5 = new SharedBikes("005","电动车","图书馆","可用",
                5);
        bike6 = new SharedBikes("006","电动车","图书馆","可用",
                5);
        bike7 = new SharedBikes("007","普通车","宿舍楼下","可用",
                2);
        bike8 = new SharedBikes("008","普通车","教学楼","可用",
                2);

    }
    //查看所有车辆
    public static void checkAllBikes(){
        System.out.println("编号 " + "类型 " + "区域 " + "状态");
        showAll(bike1);
        showAll(bike2);
        showAll(bike3);
        showAll(bike4);
        showAll(bike5);
        showAll(bike6);
        showAll(bike7);
        showAll(bike8);

    }
    //输出单个车辆
    public static void showAll(SharedBikes bike){
        System.out.println(bike.getBikeId() + " " +  bike.getType() + " " +
                bike.getLocation() + " " +  bike.getStatus());
    }
    //查看可用车辆
    public static void checkCanBikes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询区域：");
        String location = sc.next();
        System.out.println("编号 " + "类型 " + "区域 " + "状态");
        showCan(bike1, location);
        showCan(bike2, location);
        showCan(bike3, location);
        showCan(bike4, location);
        showCan(bike5, location);
        showCan(bike6, location);
        showCan(bike7, location);
        showCan(bike8, location);
    }
    //判断单个车辆可用并输出
    private static void showCan(SharedBikes bike, String location) {
        if(bike.getStatus().equals("可用") && bike.getLocation().equals(location)) {
            System.out.println(bike.getBikeId() + " " + bike.getType() + " " +
                    bike.getLocation() + " " + bike.getStatus());
        }
    }

    //租借车辆
    public static void rentBikes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入车辆编号");
        String id = sc.next();

        System.out.println();

        System.out.println("请输入使用时间");
        int time1 = sc.nextInt();
        if (rent(id,bike1,time1)) return;
        if (rent(id,bike2,time1)) return;
        if (rent(id,bike3,time1)) return;
        if (rent(id,bike4,time1)) return;
        if (rent(id,bike5,time1)) return;
        if (rent(id,bike6,time1)) return;
        if (rent(id,bike7,time1)) return;
        if (rent(id,bike8,time1)) return;
        System.out.println("车辆编号不存在");

    }
    //判断租借具体车辆 ，输出费用，并加入租借记录
    public static boolean rent(String id ,SharedBikes bike ,int time1){
        int num;
        if(bike.getBikeId().equals(id)) {
            num = bike.rentalFee(time1);
            bike.rentProcess(time1, num);
            System.out.println("费用：" + num + "元");
            records[recordCount] = new RentalRecord(id, time1, num);
            recordCount++;
            return true;
        }
        return false;
    }
    //归还车辆
    public static void returnBikes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入车辆编号");
        String id = sc.next();
        System.out.println();

        if(bike1.getBikeId().equals(id)){
            bike1.retBike();

        }else if(bike2.getBikeId().equals(id)){
            bike2.retBike();

        }else if(bike3.getBikeId().equals(id)){
            bike3.retBike();

        }else if(bike4.getBikeId().equals(id)){
            bike4.retBike();

        }else if(bike5.getBikeId().equals(id)){
            bike5.retBike();

        }else if(bike6.getBikeId().equals(id)){
            bike6.retBike();

        }else if(bike7.getBikeId().equals(id)){
            bike7.retBike();

        }else if(bike8.getBikeId().equals(id)){
            bike8.retBike();
        }else{
            System.out.println("车辆编号不存在");
        }
    }

    public static void checkRecords(){
        System.out.println("编号 " + "时间 " + "费用 ");
        for(int i=0;i<recordCount;i++){
            System.out.println(
                    records[i].getBikeId()+" "
                            +records[i].getTime()+"小时 "
                            +records[i].getCost()+"元"
            );
        }
    }
}
