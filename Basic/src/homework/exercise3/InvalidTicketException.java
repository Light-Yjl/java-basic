package homework.exercise3;

import java.util.Scanner;

public class InvalidTicketException extends Exception{
    private double distance;

    public InvalidTicketException(double distance) {
        super("INVALID");
        this.distance = distance;
    }

}
