package homework.exercise3.Phone;

public abstract class Phone {
    private String code;

    public Phone() {
    }

    public Phone(String code) {
        this.code = code;
    }
    public abstract void display();
}
