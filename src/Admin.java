import java.util.Scanner;

public class Admin {

    Scanner input = new Scanner(System.in);

    Flights flights = new Flights();

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

        System.out.println(wantedOrigin);
        System.out.println(wantedDestination);
        System.out.println(wantedDate);

        for (int i = 0; i < 100; i++) {
            if (!(flights.flight[i] == null)) {
                if (flights.flight[i].getOrigin().equals(wantedOrigin)) {
                    if (flights.flight[i].getDestination().equals(wantedDestination)) {
                        if (flights.flight[i].getDate().equals(wantedDate)) {
                            System.out.println("lkkl");
                        } else {
                            System.out.println("date");
                        }
                    } else {
                        System.out.println("dest");
                    }
                } else {
                    System.out.println("Orig");
                }
            } else {
                System.out.println("nima");
            }
        }
    }
}