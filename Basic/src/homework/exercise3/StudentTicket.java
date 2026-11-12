package homework.exercise3;

public class StudentTicket extends Ticket{
    public StudentTicket(int distance) throws InvalidTicketException {
        super(distance);
    }
    @Override
    public int countPrice(){
        return getDistance() * 2;
    }
    public void show(){
        System.out.println("Student " + countPrice());
    }
}
