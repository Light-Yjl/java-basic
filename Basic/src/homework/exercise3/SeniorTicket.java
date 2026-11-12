package homework.exercise3;

public class SeniorTicket extends Ticket{
    public SeniorTicket(int distance) throws InvalidTicketException {
        super(distance);
    }
    @Override
    public int countPrice(){
        return getDistance();
    }
    @Override
    public void show(){
        System.out.println("Senior " + countPrice());
    }
}
