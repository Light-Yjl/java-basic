package homework.exercise2.salary;

public class BonusEmployee extends Employee{
    private int bonus;

    public BonusEmployee(){
    }

    public BonusEmployee(String name, int base, int bonus) {
        super(name, base);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public long getPay(){
        return getBonus() + getBase();
    }
}
