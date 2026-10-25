package homework.exercise2.counter;

public class BoundedCounter {
    private int value;
    private int limit;

    public BoundedCounter(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public int getValue() {
        return value;
    }
    public void add(int num){
        if(this.value + num <= this.limit) {
            this.value += num;
            System.out.println("OK " + this.value);
        }else{
            System.out.println("REJECT " + this.value);
        }
    }
    public void remove(int num){
        if(this.value - num >= 0){
            this.value -= num;
            System.out.println("OK " + this.value);
        }else{
            System.out.println("REJECT " + this.value);
        }
    }
    public void reset(){
        this.value = 0;
        System.out.println(this.value);
    }
}
