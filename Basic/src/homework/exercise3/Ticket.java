package homework.exercise3;

public abstract class Ticket {
    private int distance;
    private int price;

    public Ticket(int distance) throws InvalidTicketException {
        if(distance > 0){
            this.distance = distance;
        }else{
            throw new InvalidTicketException(distance);
        }
    }


    public int getDistance() {
        return distance;
    }

    public abstract int countPrice();
    public abstract void show();
}
