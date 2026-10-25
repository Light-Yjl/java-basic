package oop.test.game;

public class game {
    public static void main(String[] args) {
        hero r1 = new hero("小乔",100);
        hero r2 = new hero("安琪拉",100);
        while (true) {
            r1.fight(r2);
            if(r2.getBlood() == 0) {
                System.out.println("游戏结束," + r1.getName() + "获胜");
                break;
            }
            r2.fight(r1);
            if (r1.getBlood() == 0) {
                System.out.println("游戏结束," + r2.getName() + "获胜");
                break;
            }
        }
    }
}
