package homework.exercise3;

public class TicketFactory {
    public static Ticket creat(String type,int distance)
            throws InvalidTicketException{
            switch (type){
                case "A" ->{
                    return new AdultTicket(distance);
                }
                case "S" ->{
                    return new StudentTicket(distance);
                }
                case "E" ->{
                    return new SeniorTicket(distance);
                }
                default -> throw new InvalidTicketException(distance);
            }
    }
}
