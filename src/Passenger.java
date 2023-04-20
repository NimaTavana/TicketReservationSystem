import java.util.Scanner;
import java.util.SortedMap;

public class Passenger {

    private String userName;
    private String password;
    private double charge;
    Scanner input = new Scanner(System.in);

    Passengers passengers = new Passengers();
    Flights flights = new Flights();

    // setter and getter

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    // methods


    public void changePassword() {

        System.out.println("Enter Your Old Password");
        String prompt = input.next();
        if (password.equals(prompt)) {
            System.out.println("Enter Your New Password");
            password = input.next();
            System.out.println("Your New Password : " + password);
        } else {
            while (true) {
                changePassword();
            }
        }

        // below is ended
        var menu = new Menu();
        menu.passengerMenu();
    }     // completed

    public void bookingTicket() {

        int i = 0;
        int yourSeatNumber = (int) Math.round(Math.random() * 100);
        System.out.print("Your Seat Number Is : " + yourSeatNumber);
        int j = flights.flight[i].getSeats() - 1;
        System.out.println(j);

        charge = charge - flights.flight[i].getPrice();
        flights.flight[i].setSeats(flights.flight[i].getSeats() - 1);
    }

    public void ticketCancellation() {

        String inputedFlightId;
        String inputedSeat;

        System.out.println("Enter The Your Ticket ID To Cancel");
        System.out.println("Enter Your Flight ID And Your Seat Number");
        inputedFlightId = input.next();
        inputedSeat = input.next();
        int i = 0;
        if (flights.flight[i].getFlightId().equals(inputedFlightId)) {
            System.out.println("");
        }

        // below is ended
        var menu = new Menu();
        menu.passengerMenu();
    }

    public void addCharge() {

        System.out.println("Enter The Amount That You Want To Charge");
        double chargeAmount = input.nextDouble();
        charge = charge + chargeAmount;
        System.out.print("Your Charge Amount is : " + charge);

        //below is ended
        var menu = new Menu();
        menu.passengerMenu();
    }         // completed

    public void searchFlight() {

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

    public void bookedTickets() {


        // below is ended
        var menu = new Menu();
        menu.passengerMenu();
    }
}