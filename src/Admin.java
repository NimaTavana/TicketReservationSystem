import java.util.Scanner;

public class Admin {

    Scanner input = new Scanner(System.in);

    Flights flights = new Flights();

    private double charge;

    // methods

    public void addFlight() {

        for (int i = 0; i < 100; i++) {
            if (flights.flight[i] == null) {

                flights.flight[i] = new Flight();

                System.out.println("If You Want To Add Any Flight You Should Fill All Information Below");
                System.out.println("Enter Flight ID");
                flights.flight[i].setFlightId(input.next());
                System.out.println("Flight ID : " + flights.flight[i].getFlightId());

                System.out.println("Enter Origin");
                flights.flight[i].setOrigin(input.next());
                System.out.println("Flight Origin : " + flights.flight[i].getOrigin());

                System.out.println("Enter Destination");
                flights.flight[i].setDestination(input.next());
                System.out.println("Flight Destination : " + flights.flight[i].getDestination());

                System.out.println("Enter Date");
                flights.flight[i].setDate(input.next());
                System.out.println("Flight Date : " + flights.flight[i].getDate());

                System.out.println("Enter Time");
                flights.flight[i].setTime(input.next());
                System.out.println("Flight Time : " + flights.flight[i].getTime());

                System.out.println("Enter Price");
                flights.flight[i].setPrice(input.nextInt());
                System.out.println("Flight Price : " + flights.flight[i].getPrice());

                System.out.println("Enter Seats");
                flights.flight[i].setSeats(input.nextInt());
                System.out.println("Flight Seats : " + flights.flight[i].getSeats());

                System.out.println(" | " + flights.flight[i].getFlightId() + " | " + flights.flight[i].getOrigin() + " | "
                        + flights.flight[i].getDestination() + " | " + flights.flight[i].getDate() + " | "
                        + flights.flight[i].getTime() + " | " + flights.flight[i].getPrice() + " | " + flights.flight[i].getSeats());
                break;
            }
        }
    }       // completed
    public void updateFlight() {

        System.out.println("Enter The FlightID That You Want To Update");
        String prompt = input.next();

        for (int i = 0; i < 100; i++) {
            if (!(flights.flight[i] == null) && flights.flight[i].getFlightId().equals(prompt)) {

                System.out.println("Enter Origin");
                flights.flight[i].setOrigin(input.next());
                System.out.println("Flight Origin : " + flights.flight[i].getOrigin());

                System.out.println("Enter Destination");
                flights.flight[i].setDestination(input.next());
                System.out.println("Flight Destination : " + flights.flight[i].getDestination());

                System.out.println("Enter Date");
                flights.flight[i].setDate(input.next());
                System.out.println("Flight Date : " + flights.flight[i].getDate());

                System.out.println("Enter Time");
                flights.flight[i].setTime(input.next());
                System.out.println("Flight Time : " + flights.flight[i].getTime());

                System.out.println("Enter Price");
                flights.flight[i].setPrice(input.nextInt());
                System.out.println("Flight Price : " + flights.flight[i].getPrice());

                System.out.println("Enter Seats");
                flights.flight[i].setSeats(input.nextInt());
                System.out.println("Flight Seats : " + flights.flight[i].getSeats());

                System.out.println(" | " + flights.flight[i].getFlightId() + " | " + flights.flight[i].getOrigin() + " | "
                        + flights.flight[i].getDestination() + " | " + flights.flight[i].getDate() + " | "
                        + flights.flight[i].getTime() + " | " + flights.flight[i].getPrice() + " | " + flights.flight[i].getSeats());
            }
            if (i == 99 || i == 100) {
                System.out.println("rere");
            }

//            else {
//                System.out.println("Flight Did Not Found");
//            }
        }
    }    // completed
    public void removeFlight() {

        System.out.println("Enter The FlightID That You Want To Remove");
        String prompt = input.next();

        for (int i = 0; i < 100; i++) {
            if (flights.flight[i] != null && flights.flight[i].getFlightId().equals(prompt)) {

                flights.flight[i] = new Flight();

                flights.flight[i].setFlightId("");
                System.out.println(flights.flight[i].getFlightId());

                flights.flight[i].setOrigin("");
                System.out.println(flights.flight[i].getOrigin());

                flights.flight[i].setDestination("");
                System.out.println(flights.flight[i].getDestination());

                flights.flight[i].setDate("");
                System.out.println(flights.flight[i].getDate());

                flights.flight[i].setTime("");
                System.out.println(flights.flight[i].getTime());

                flights.flight[i].setPrice(0);
                System.out.println(flights.flight[i].getPrice());

                flights.flight[i].setSeats(0);
                System.out.println(flights.flight[i].getSeats());

                System.out.println(" | " + flights.flight[i].getFlightId() + " | " + flights.flight[i].getOrigin() + " | "
                        + flights.flight[i].getDestination() + " | " + flights.flight[i].getDate() + " | "
                        + flights.flight[i].getTime() + " | " + flights.flight[i].getPrice() + " | " + flights.flight[i].getSeats());
            }
        }
    }    // completed
    public void flightSchedule() {

        for (int i = 0; i < 100; i++) {
            if (flights.flight[i] != null) {

                System.out.println(flights.flight[i].getFlightId() + " | " + flights.flight[i].getOrigin() + " | " +
                        flights.flight[i].getDestination() + " | " + flights.flight[i].getDate() + " | " +
                        flights.flight[i].getTime() + " | " + flights.flight[i].getPrice() + " | " +
                        flights.flight[i].getSeats() + " | ");
            }
        }
    }  // completed
    public void searchFlight1() {

        String wantedOrigin;
        String wantedDestination;
        String wantedDate;

        System.out.println("Enter Your Origin");
        input.nextLine();
        wantedOrigin = input.nextLine();
        System.out.println("Enter Your Destination");
        wantedDestination = input.nextLine();
        System.out.println("Enter Your Date");
        wantedDate = input.nextLine();

        for (int i = 0; i < 100; i++) {
            if (!(flights.flight[i] == null)) {
                if (flights.flight[i].getOrigin().equals(wantedOrigin)) {
                    if (flights.flight[i].getDestination().equals(wantedDestination)) {
                        if (flights.flight[i].getDate().equals(wantedDate)) {
                            System.out.println(flights.flight[i].getFlightId() + " | " + flights.flight[i].getOrigin() + " | " +
                                    flights.flight[i].getDestination() + " | " + flights.flight[i].getDate() + " | " +
                                    flights.flight[i].getTime() + " | " + flights.flight[i].getPrice() + " | " +
                                    flights.flight[i].getSeats());
                        }
                    }
                }
            }
        }
    }   // completed
    public void bookingTicket1() {
//
//        System.out.println("Enter The Flight ID");
//        String prompt = input.next();
//        System.out.println("Your Desired Flight ID is : " + prompt);
//
//        int i = 0;
//        if (flights.flight[i].equals(prompt)) {
//            System.out.println(flights.flight[i].getFlightId() + " | " + flights.flight[i].getOrigin() + " | " +
//                    flights.flight[i].getDestination() + " | " + flights.flight[i].getDate() + " | " +
//                    flights.flight[i].getTime() + " | " + flights.flight[i].getPrice() + " | " +
//                    flights.flight[i].getSeats());
//        }
//
//        else {
//            System.out.println("Flight Id Did Not Found");
//        }

//        i = 0;
//        int yourSeatNumber = (int) Math.round(Math.random() * 100);
//        System.out.println("Your Seat Number Is : " + yourSeatNumber);
//        int j = flights.flight[i].getSeats() - 1;
//        System.out.println(j);
//
//        charge = charge - flights.flight[i].getPrice();
//        flights.flight[i].setSeats(flights.flight[i].getSeats() - 1);
//
//        System.out.println(flights.flight[i].getFlightId() + " | " + flights.flight[i].getOrigin() + " | " +
//                flights.flight[i].getDestination() + " | " + flights.flight[i].getDate() + " | " +
//                flights.flight[i].getTime() + " | " + flights.flight[i].getPrice() + " | " +
//                flights.flight[i].getSeats());
        int i = 0;

        System.out.println("Enter The Flight ID");
        String prompt = input.next();
        if (flights.flight[i] != null && flights.flight[i].getFlightId().equals(prompt)) {

            for (int j = 0; j < 100; j++) {
                if (flights.flight[i].getPrice() <= charge) {

                    if (flights.flight[i].tickets.ticket[i] == null) {
                        flights.flight[i].tickets.ticket[i] = new Ticket();
                        flights.flight[i].tickets.ticket[i].setFlightId(flights.flight[i].getFlightId());
                        flights.flight[i].tickets.ticket[i].setOrigin(flights.flight[i].getOrigin());
                        flights.flight[i].tickets.ticket[i].setDestination(flights.flight[i].getDestination());
                        flights.flight[i].tickets.ticket[i].setDate(flights.flight[i].getDate());
                        flights.flight[i].tickets.ticket[i].setTime(flights.flight[i].getTime());
                        flights.flight[i].tickets.ticket[i].setPrice(flights.flight[i].getPrice());
                        flights.flight[i].tickets.ticket[i].setSeats(flights.flight[i].getSeats());




                        int yourSeatNumber = (int) Math.round(Math.random() * 100);
                        System.out.println("Your Seat Number Is : " + yourSeatNumber);
                        j = flights.flight[i].getSeats() - 1;
                        System.out.println(j);

                        flights.flight[i].tickets.ticket[i] = new Ticket();
                        flights.flight[i].tickets.ticket[i].setTicketId(flights.flight[i].getFlightId() + yourSeatNumber);
                        System.out.println("Your Ticket ID Is : " + flights.flight[i].getFlightId() + yourSeatNumber);

//        passengers.passenger[i].setCharge(passengers.passenger[i].getCharge() - flights.flight[i].getPrice());
                        charge = charge - flights.flight[i].getPrice();
                        flights.flight[i].setSeats(flights.flight[i].getSeats() - 1);

                        System.out.println(flights.flight[i].getFlightId() + " | " + flights.flight[i].getOrigin() + " | " +
                                flights.flight[i].getDestination() + " | " + flights.flight[i].getDate() + " | " +
                                flights.flight[i].getTime() + " | " + flights.flight[i].getPrice() + " | " +
                                flights.flight[i].getSeats());
                        break;
                    }
                }

                if (flights.flight[i].getPrice() > charge) {
                    System.out.println("Your Charge Amount Is Not Enough");
                    System.out.println("Please Recharge Your Account And Try Again Later");
                }
            }
        }
        else {
            System.out.println("Flight Did Not Found");
        }

    }  // completed but fix charge
    public void ticketCancellation1() {

        System.out.println("Enter The Your Ticket ID To Cancel");
        String prompt = input.next();
        int i = 0;
        if (flights.flight[i].tickets.ticket[i] != null && flights.flight[i].tickets.ticket[i].getTicketId().equals(prompt)) {
            flights.flight[i].setSeats(flights.flight[i].getSeats() + 1);
            System.out.println("Your Ticket Has Been Cancelled And Your Charge Will Be Returned Soon");
        }

    }   // NEVER USED completed
//    public void addCharge1() {
//
//        System.out.println("Enter The Amount That You Want To Charge");
//        double chargeAmount = input.nextDouble();
//        charge = charge + chargeAmount;
//        System.out.print("Your Charge Amount is : " + charge);
//    }         // not completed

    public void addCharge() {

        System.out.println("Enter The Amount That You Want To Charge");
        double chargeAmount = input.nextDouble();
        charge = charge + chargeAmount;
        System.out.print("Your Charge Amount is : " + charge);

    }
}