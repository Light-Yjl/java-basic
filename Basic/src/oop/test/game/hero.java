package oop.test.game;

import java.util.Random;

public class hero {
    private String name;
    private int blood;

    public hero(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void fight(hero other){
        Random r = new Random();
        int hurt = r.nextInt(20);
        int remainBlood = other.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        other.setBlood(remainBlood);
        System.out.println(this.getName() + "击打" + other.getName()
        + "," + other.getName() +"血量减少了" + hurt +","+ other.getName()+
                "血量为" + remainBlood);
    }
}
