package homework.exercise2.salary;

public class HourlyEmployee extends Employee{
    private int hours;
    private int rate;

    public HourlyEmployee(){
    }

    public HourlyEmployee(String name, int base, int hours, int rate) {
        super(name, base);
        this.hours = hours;
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public long getPay(){
        return getBase() + getHours() * (long)getRate();
    }
}
