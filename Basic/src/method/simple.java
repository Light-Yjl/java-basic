package method;

public class simple {
    public static void main(String[] args){
        //最简单的方法定义和调用
        //调用方法
        playGame();
        System.out.println("-------------------");
        playGame();
    }
    public static void playGame(){
        //这就是一个方法
        System.out.println("选英雄");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("destroyed");
    }
}
