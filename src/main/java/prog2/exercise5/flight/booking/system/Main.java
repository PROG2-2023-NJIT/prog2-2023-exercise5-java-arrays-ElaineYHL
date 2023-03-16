package prog2.exercise5.flight.booking.system;

import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
    
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("please input the total number of tickets you reserve");
        int size = scanner4.nextInt();
        FlightBooking fb = new FlightBooking(size);
        fb.reserveTickets(size);
        scanner4.close();
    }
}

        
    

