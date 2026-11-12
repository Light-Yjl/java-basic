package homework.exercise3;

public class AdultTicket extends Ticket{
    public AdultTicket(int distance) throws InvalidTicketException {
        super(distance);
    }
    @Override
    public int countPrice(){
        return getDistance() * 3;
    }
    public void show(){
        System.out.println("Adult " + countPrice());
    }
}
