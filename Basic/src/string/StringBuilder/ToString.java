package string.StringBuilder;

public class ToString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        String str = sb.toString();
        System.out.println(str);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb1);
    }
}
