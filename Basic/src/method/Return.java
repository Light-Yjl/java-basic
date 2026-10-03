package method;

public class Return {
    public static void main(String[] args) {
        /*格式：
        public static 返回值类型 方法名 (参数){
            方法体;
            return 返回值;
            }
         */

        //直接调用,无输出
        getSum(300,400,500);

        //赋值调用,打印有输出
        int sum = getSum(300,400,500);
        System.out.println(sum);

        System.out.println("---------------------------");

        //计算每个季度的营业额并求和
        int sum1 = getSum(300,400,500);
        int sum2 = getSum(200,500,300);
        int sum3 = getSum(400,100,200);
        int sum4 = getSum(100,300,400);
        int res = sum1 + sum2 + sum3 + sum4;
        System.out.println(res);

    }
    public static int getSum(int a,int b,int c){
        return a + b + c;
    }

}
