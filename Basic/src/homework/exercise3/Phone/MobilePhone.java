package homework.exercise3.Phone;

public class MobilePhone extends Phone implements PayAble{
    private int time;
    private double price;

    public MobilePhone(String code, int time, double price) {
        super(code);
        this.time = time;
        this.price = price;
    }

    @Override
    public void display() {

    }

    @Override
    public double pay() throws PayException {
        double p = time * price;
        if(p <= 0) throw new PayException();
        return p;
    }
}
