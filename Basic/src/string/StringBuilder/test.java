package string.StringBuilder;
//append()
//reverse()
//lenth()
//toString()

public class test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        //添加
        sb.append(" ");
        sb.append("world");
        sb.append(" ");
        sb.append(1);
        sb.append(" ");
        sb.append(true);
        //反转
        sb.reverse();
        sb.reverse();

        //获取长度
        int num =  sb.length();
        System.out.println(sb);
        System.out.println(num);
    }
}
