package oop.test.product;

public class Main {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001","手机",5999,100);
        Goods g2 = new Goods("002","保温杯",227,50);
        Goods g3 = new Goods("003","零食",12.7,100);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId()+" " +
                    arr[i].getName() + " " +
                    arr[i].getPrice() + " " +
                    arr[i].getCount());
        }
    }
}
