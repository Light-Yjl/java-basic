package method;

public class demo1traverse {
    public static void main(String[] args) {
        //遍历数组，打印在一行
        int [] arr = {1,2,3,4,5};
        printArr(arr);

//        System.out.println("abc"); //先打印abc，再换行
//        System.out.print("abc");//只打印abc，不换行
//        System.out.print("bcd");//打印在abc后面
//        System.out.println();//打印任何数据，只做换行处理

    }

    //定义方法用于数组遍历

    public static void printArr(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i] );
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
// 学习阶段：手动遍历，练习数组作为方法参数
// 实际开发：System.out.println(Arrays.toString(arr));