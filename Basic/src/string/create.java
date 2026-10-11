package string;

public class create {
    public static void main(String[] args) {
        //直接赋值
        String s1 = "abc";
        String s2 = "";//null和空字符不同,null代表不指向任何对象
        //使用new String
        String s3 = new String("Hello"); //new String冗余可以不写
        String s4 = new String("");//得到空字符串
        //根据char创建
        char[] arr = {'a','b','c','d','e','f'};
        String s5 = new String(arr);
        String s6 = new String(arr,1,3);//可以只取一部分创建
        //根据byte创建
        byte[] bytes = {21,36,89};
        String s7 = new String(bytes);
    }
}
