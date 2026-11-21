package homework.exercise3.Phone;

public class PayException extends Exception {
    public PayException() {
        super("Fee is 0");
    }
    public PayException(String message){
        super(message);
    }

}
