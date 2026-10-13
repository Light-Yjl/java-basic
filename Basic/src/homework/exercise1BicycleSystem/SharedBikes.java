package homework.exercise1BicycleSystem;

public class SharedBikes {
    private String bikeId;
    private String type;
    private String location;
    private String status;
    private int perRent;
    private RentalRecord currentRecord;


    public SharedBikes(String bikeId, String type, String location,
                       String status, int perRent ) {
        this.bikeId = bikeId;
        this.type = type;
        this.location = location;
        this.status = status;
        this.perRent = perRent;
    }

    public String getBikeId() {
        return bikeId;
    }
    public String getType() {
        return type;
    }
    public String getLocation() {
        return location;
    }
    public String getStatus() {
        return status;
    }

    //计算费用
    public int rentalFee(int time){
        int num = 0;

        if(type.equals("普通车")) {
            num = perRent * time;
        }else if(type.equals("电动车")){
            num = 5 * time;
        }

        return num;
    }
    //租借流程
    public void rentProcess(int time,int cost){
        if(status.equals("可用")){
            status = "已租借";
            System.out.println("租借成功！");
            //添加一个租借记录方便归还的时候输出时间和价格
            currentRecord = new RentalRecord(bikeId, time, cost);

        }else{
            System.out.println("车辆已租借");
        }
    }
    //归还车辆
    public void retBike(){
        if(status.equals("已租借")){
            status = "可用";
            System.out.println("归还成功！");
            System.out.println("使用时间：");
            System.out.println(currentRecord.getTime() + "小时");
            System.out.println("费用：");
            System.out.println(currentRecord.getCost() + "元");
        }else{
            System.out.println("车辆未租借，无法归还");
        }
        currentRecord = null;
    }


}
