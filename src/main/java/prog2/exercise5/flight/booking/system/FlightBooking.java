package prog2.exercise5.flight.booking.system;
import java.time.LocalDate;
import java.util.Scanner;
public class FlightBooking {
    String flightID = "FOF0345IN";
    static String flightCompany = "Flights-of-Fancy";
    private static String[] passengerFullName;
    private static String[] passengerGender;
    private static int[] passengerAge;
    private static TripSource tripSource;
    private static SourceAirport sourceAirport;
    private static TripDestination tripDestination;
    private static DestinationAirport destinationAirport;
    private static  LocalDate departureDate;
    private static LocalDate returnDate;
    private static int childPassengers;
    private static int adultPassengers;
    private static int totalPassengers;
    private static double departingTicketPrice;
    private static double returnTicketPrice;
    private static double totalTicketPrice;
    private static String[] ticketNumber;
    private static BookingClass bookingClass;
    private static TripType tripType;
    private static int size;



    public FlightBooking(int i){
        passengerFullName =  new String[i];
        passengerGender = new String[i];
        passengerAge = new int[i];
        ticketNumber = new String[i];

        
    }


    public void reserveTickets(int size){
        
        Scanner input4 = new Scanner(System.in);
        System.out.println("please input your date of departure");
        String departureDate = input4.nextLine();
        LocalDate departure = LocalDate.parse(departureDate);
        

        Scanner input5 = new Scanner(System.in);
        System.out.println("please input your date of return");
        String returnDate = input4.nextLine();
        LocalDate returningDate = LocalDate.parse(returnDate);
        

        Scanner scanner = new Scanner(System.in);
        String [] fullName = new String[200];
        for(int i = 0;i < 3;i++) {
            System.out.println("please input your passengerFullName");
            fullName[i] = scanner.nextLine();
            setPassengerFullName(i,fullName[i] );
            getPassengerFullName(i);

        }

        Scanner scanner1 = new Scanner(System.in);
        String [] gender = new String[200];
        for(int i = 0;i < 3;i++) {
            System.out.println("please input your gender");
            gender[i] = scanner1.nextLine();
            setPassengerGender(i, gender[i]);
            getPassengerGender(i);

        }

        Scanner scanner2 = new Scanner(System.in);
        int [] age = new int[200];
        for(int i = 0;i <3;i++) {
            System.out.println("please input your age");
            age[i] = scanner2.nextInt();
            setPassengerAge(i,age[i]);
            getPassengerAge(i);
        }

       

        System.out.println("Please choose 1.First 2.Business 3.Economy");
        Scanner input1 = new Scanner(System.in);
        int choices1 = input1.nextInt();
        String a = new String();
        switch(choices1){
            case 1:
            a="1";
            setBookingClass(a);
            break;

            case 2:
            a="2";
            setBookingClass(a);
            break;

            case 3:
            a="3";
            setBookingClass(a);
            break;

        }
        getBookingClass();

        System.out.println("please choose your trip source 1.Nanjing 2.Beijing 3.Oulu 4.Helsinki");
        Scanner input2 = new Scanner(System.in);
        int choices2 = input2.nextInt();
        String b = new String();
        switch(choices2) {
            case 1:
            b="1";
            setTripSource(b);setSourceAirport(b);
            break;

            case 2:
            b="2";
            setTripSource(b);setSourceAirport(b);
            break;

            case 3:
            b="3";
            setTripSource(b);setSourceAirport(b);
            break;

            case 4:
            b="4";
            setTripSource(b);setSourceAirport(b);
            break;
        }
        getTripSource();

        System.out.println("please choose your tripDestination 1.Nanjing 2.Beijing 3.Oulu 4.Helsinki");
        Scanner input3 = new Scanner(System.in);
        int choices3 = input3.nextInt();
        String c = new String();
        switch(choices3) {
            case 1:
            c="1";
            setTripDestination(b,c);setDestinationAirport(b, c);
            break;

            case 2:
            c="2";
            setTripDestination(b,c);setDestinationAirport(b, c);
            break;

            case 3:
            c="3";
            setTripDestination(b,c);setDestinationAirport(b, c);
            break;

            case 4:
            c="4";
            setTripDestination(b,c);setDestinationAirport(b, c);
            break;
        }
        getTripDestination();

        System.out.println("please choose your triptype");
        Scanner input6 = new Scanner(System.in);
        int choices6 = input6.nextInt();
        String d = new String();
        switch(choices6) {
            case 1:
            d="1";
            setTripType(d);
            break;

            case 2:
            d="2";
            setTripType(d);
            break;
        }
        getTripType();

        String company = getFlightCompany();
        TripSource source = getTripSource();
        TripDestination destination = getTripDestination();
        setTotalPassengers(20,10);
        int totalPassengers = getTotalPassengers();


        for(int i =0;i<3;i++){
        setTicketNumber(i);
        getTicketNumber(i);
        }

        setTotalTicketPrice();
        double totalTicketPrice = getTotalTicketPrice();

        System.out.println("Please enter the passenger's ticketnumber you want to inquire ");
        Scanner scanner3 = new Scanner(System.in);
        int i = scanner3.nextInt();
        for(i =0;i<size;i++){
            setTicketNumber(i);
            getTicketNumber(i);
            }

            

        for(i =0;i < 3;i++){
        System.out.println("Thank you for booking your flight with " + 
        company + "." + "\n" + "You reserved a total of 3 tickets."+ "Here are the trip details for Passenger"+ size + "\n" + 
        "Ticket Number: " + ticketNumber[i] + "\n" + 
        "Passenger's Full Name: " + passengerFullName[i]+"\n" +
        "Passenger's Age: "  + passengerAge[i] +"\n" +
        "Passenger's Gender: "+ passengerGender[i] +"\n" +
        "From " + source + "(" + sourceAirport + ")"+"\n"+ " to " + destination + "(" + destinationAirport + ")"+ "\n" +
        "Date of departure: " + departure + "\n" +
        "Date of return: " + returningDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice);
        
        int result = returnDate.compareTo(departureDate);
        if(result == 1 || result == 0) {
            System.out.println("IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.");
        }
        
    }
            scanner.close();
            scanner1.close();
            scanner2.close();
            scanner3.close();
            input1.close();
            input2.close();
            input3.close();
            input4.close();
            input5.close();
            input6.close();
        
    
    
}
        

    public String getFlightCompany(){
        return flightCompany;
    }



    public String getPassengerFullName(int i) {
        return passengerFullName[i];
    }
    public void setPassengerFullName(int i,String scanner) {
        FlightBooking.passengerFullName[i] = scanner;
         
       
       
    }

    public String getPassengerGender(int i) {
        return passengerGender[i];
    }
    public void setPassengerGender(int i,String scanner1) {
        FlightBooking.passengerGender[i] = scanner1;
        }
    

    public int getPassengerAge(int i){
        return passengerAge[i];
    }
    public void setPassengerAge(int i,int scanner2) {
        FlightBooking.passengerAge[i] = scanner2;

        }


    


    public static TripSource getTripSource() {
        return tripSource;
    }
    public enum TripSource {
        NANJING, BEIJING, OULU, HELSINKI;
    }
    public void setTripSource(String input2) {
        switch (input2) {
            case "1":
            tripSource= TripSource.NANJING;
            break;

            case "2":
            tripSource= TripSource.BEIJING;
            break; 

            case "3":
            tripSource= TripSource.OULU;
            break;

            case "4":
            tripSource= TripSource.HELSINKI;
            break;

            default:
            System.out.println("you don't have a choice");
            break;
        }
    }


    public static SourceAirport getSourceAirport()  {
        return sourceAirport;
    }
    public enum SourceAirport {
        Nanjing_Lukou_International_Airport, 
        Beijing_Capital_International_Airport, 
        Oulu_Airport, 
        Helsinki_Airport, 
    }
    public void setSourceAirport(String input7){
        switch(input7){
            case "1":
            sourceAirport = SourceAirport.Nanjing_Lukou_International_Airport;
            break;

            case "2":
            sourceAirport = SourceAirport.Beijing_Capital_International_Airport;
            break; 

            case "3":
            sourceAirport = SourceAirport.Oulu_Airport;
            break;

            case "4":
            sourceAirport = SourceAirport.Helsinki_Airport;
            break;

            default:
            System.out.println("you don't have a choice");
            break;
        } 
        }
    


    public TripDestination getTripDestination() {
        return tripDestination;
    }
    public enum TripDestination {
        NANJING, BEIJING, OULU, HELSINKI;
    }
    public void setTripDestination(String input2,String input3 ) {
        switch (input2) {
            case "1":
            tripDestination = TripDestination.NANJING;

            break;

            case "2":
            tripDestination = TripDestination.BEIJING;
            break; 

            case "3":
            tripDestination = TripDestination.OULU;
            break;

            case "4":
            tripDestination = TripDestination.HELSINKI;
            break;

            default:
            System.out.println("you don't have a choice");
            break;
        }
        
    }
    

    public DestinationAirport getDestinationAirport() {
        return destinationAirport;
    }
    public enum DestinationAirport {
        Nanjing_Lukou_International_Airport, 
        Beijing_Capital_International_Airport, 
        Shanghai_Pudong_International_Airport, 
        Oulu_Airport, 
        Helsinki_Airport,
        Paris_Charles_de_Gaulle_Airport;
    }
    public void setDestinationAirport(String input9,String input10){
        switch (input9) {
            case "1":
            destinationAirport = DestinationAirport.Nanjing_Lukou_International_Airport;
            break;

            case "2":
            destinationAirport = DestinationAirport.Beijing_Capital_International_Airport;
            break; 

            case "3":
            destinationAirport = DestinationAirport.Oulu_Airport;
            break;

            case "4":
            destinationAirport = DestinationAirport.Helsinki_Airport;
            break;

            default:
            System.out.println("you don't have a choice");
            break;
        }

    }


    public LocalDate getDepartureDate() {
        return departureDate;
        
    }
    public void setDepartureDate(LocalDate depart) {
        FlightBooking.departureDate = depart;

    }


    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        int result = returnDate.compareTo(departureDate);
        if(result >= 2){
            FlightBooking.returnDate = returnDate;
        }
        if(result == 1){
            returnDate = returnDate.plusDays(1);
            FlightBooking.returnDate = returnDate;
        }
        if(result == 0){
            returnDate = returnDate.plusDays(2);
            FlightBooking.returnDate = returnDate;
        }

        
    }
    

    public int getChildPassengers() {
        return childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }
    
    public int getTotalPassengers() {
        return totalPassengers;
    }
    public void setTotalPassengers(int ChildPassengers, int AdultPassengers) {
        totalPassengers = ChildPassengers + AdultPassengers;
    }


    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int childPassengers,int adultPassengers){
        if((tripSource==TripSource.NANJING && tripDestination == TripDestination.BEIJING) || (tripSource==TripSource.BEIJING && tripDestination == TripDestination.NANJING) || (tripSource==TripSource.HELSINKI && tripDestination == TripDestination.OULU) || (tripSource==TripSource.OULU && tripDestination == TripDestination.HELSINKI)) {
            double taxes = 30;
            double service_fees = 15;
            departingTicketPrice = (300 + taxes + service_fees) * (childPassengers + adultPassengers);
        }

        
        else{
            double taxes1 = 45;
            double service_fees1= 30;
            departingTicketPrice = (300 + taxes1 + service_fees1) * (childPassengers + adultPassengers);
    }

    }


    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(){

        if(tripType==TripType.ONE_WAY){
            returnTicketPrice = 0;
        }
        if(tripType==TripType.RETURN){
            returnTicketPrice = departingTicketPrice;
        }
    }

    public double getTotalTicketPrice() {
        return 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));
    } 
    public void setTotalTicketPrice() {
    if(tripType==TripType.ONE_WAY){
            if(bookingClass==BookingClass.FIRST) {
                totalTicketPrice = departingTicketPrice + 250;
                }else if(bookingClass==BookingClass.BUSINESS) {
                    totalTicketPrice = departingTicketPrice + 150;
                    }else if(bookingClass==BookingClass.ECONOMY) {
                        totalTicketPrice =departingTicketPrice + 50;
                        }
        }

        if(tripType==TripType.RETURN){
            if(bookingClass==BookingClass.FIRST) {
                totalTicketPrice = (departingTicketPrice + 250) *2;
                }else if(bookingClass==BookingClass.BUSINESS) {
                    totalTicketPrice = (departingTicketPrice + 150)*2;
                    }else if(bookingClass==BookingClass.ECONOMY) {
                        totalTicketPrice =(departingTicketPrice + 50) *2;
                        }
        }
        
}

        
    public String getTicketNumber(int i){
        return ticketNumber[i];
    }

    public String setTicketNumber(int i) {
        String a="0";
        String b="0";
        String c="0";


        if(tripType==TripType.ONE_WAY){
            a = "11";

        }
        if(tripType==TripType.RETURN) {
            a = "22";
        }
        if(bookingClass==BookingClass.FIRST) {
            b = "F";
        }
        if(bookingClass==BookingClass.BUSINESS){
            b = "B";
        }
        if(bookingClass==BookingClass.ECONOMY) {
            b = "E";
        }
        if((tripSource==TripSource.NANJING && tripDestination == TripDestination.BEIJING) || (tripSource==TripSource.BEIJING && tripDestination == TripDestination.NANJING) || (tripSource==TripSource.HELSINKI && tripDestination == TripDestination.OULU) || (tripSource==TripSource.OULU && tripDestination == TripDestination.HELSINKI)) {
            c = "DOM";
        }else{
            c = "INT";
        }
        ticketNumber[i] = a + b +"####" + c;
        return ticketNumber[i];
    }
    

    public BookingClass getBookingClass() {
        return bookingClass;
        
    }
    public enum BookingClass {
        FIRST,BUSINESS,ECONOMY;
    }
    public void setBookingClass(String input1) {
            switch (input1) {
                case "1":
                bookingClass = BookingClass.FIRST;
                break;
                
                case "2":
                bookingClass = BookingClass.BUSINESS;
                break;

                case "3":
                bookingClass = BookingClass.ECONOMY;
                break;

                default:
                System.out.println("you don't have a choice");
                break;
            }

    }

    public TripType getTripType() {
        return tripType;
    }
    public void setTripType(String input6){
        if(input6.equals("1")){
            tripType = TripType.ONE_WAY;
        }
        if(input6.equals("2")) {
            tripType = TripType.RETURN;
        }
    }

    public enum TripType {
        ONE_WAY,RETURN;
    }

}


    

    

