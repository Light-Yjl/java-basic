package method;
import java.util.Scanner;
public class Return1compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个长方形的长和宽：");
        double len1 = sc.nextDouble();
        double wid1 = sc.nextDouble();

        System.out.println("请输入第二个长方形的长和宽：");
        double len2 = sc.nextDouble();
        double wid2 = sc.nextDouble();

        double area1 = area(len1,wid1);
        double area2 = area(len2,wid2);

        if(area1 > area2){
            System.out.println("第一个长方形的面积 "+ area1 + "大于第二个长方形的面积 " + area2);
        }else{
            System.out.println("第一个长方形的面积 "+ area1 + "小于第二个长方形的面积 " + area2);
        }
    }
    public static double area(double len,double wid){
        return len * wid;
    }
}
