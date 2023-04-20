import java.util.Scanner;

public class Menu {

    Passengers passengers = new Passengers();

    public void menu() {

        Scanner input = new Scanner(System.in);

        int key = 0;

        firstMenu();
        secondMenu();
        key = input.nextInt();

        if (key == 1) {
            passengers.signUp();
            menu();
        }

        if (key == 2) {
            System.out.println("Enter Admin Username And Pass Otherwise You Are Passenger Enter Anything");
            String testUSer = input.next();
            if (testUSer.equals("USERADMIN")) {
                System.out.println("Enter Your Password");
                String testPassword = input.next();
                if (testPassword.equals("NIPA")) {
                    adminMenu();

                    while (true) {
                        key = input.nextInt();
                        if (key == 1) {
                            var admin = new Admin();
                            admin.addFlight();
                        }

                        if (key == 2) {
                            var admin = new Admin();
                            admin.updateFlight();
                        }

                        if (key == 3) {
                            var admin = new Admin();
                            admin.removeFlight();
                        }

                        if (key == 4) {
                            var admin = new Admin();
                            admin.flightSchedule();
                        }

                        if (key == 0) {
                            menu();
                        }
                    }
                }
            }

            int i;
            i = passengers.signIn();
            while (i == 500) {
                System.out.println("THis Account Does not Exist");
                i = passengers.signIn();
            }
            passengerMenu();

            while (true) {
                key = input.nextInt();
                if (key == 1) {
                    passengers.passenger[i].changePassword();
                }

                if (key == 2) {
                    passengers.passenger[i].searchFlight();
                }

                if (key == 3) {
                    passengers.passenger[i].bookingTicket();
                }

                if (key == 4) {
                    passengers.passenger[i].ticketCancellation();
                }

                if (key == 5) {
                    passengers.passenger[i].bookedTickets();
                }

                if (key == 6) {
                    passengers.passenger[i].addCharge();
                }

                if (key == 0) {
                    menu();
                }
            }
        }

        if (key != 1 && key != 2) {
            menu();
        }
    }

    public void firstMenu() {

        System.out.println("""
                                
                .................................................
                .................................................
                ......WELCOME TO AIRLINE RESERVATION SYSTEM......
                                
                """);
    }

    public void secondMenu() {
        System.out.println("""
                                
                ..................MENU OPTION....................
                                
                <1> SIGN UP
                <2> SIGN IN
                                
                """);
    }

    public void adminMenu() {

        System.out.println("""
                                
                .................................................
                .................................................

                ..................ADMIN MENU.....................

                <1> Add
                <2> Update
                <3> Remove
                <4> Flight Schedule
                <0> Sign Out
                                
                """);
    }

    public void passengerMenu() {

        System.out.println("""
                                
                .................................................
                .................................................
                                
                .................PASSENGER MENU...................
                                
                <1> Change Password
                <2> Search Flight Ticket
                <3> Booking Ticket
                <4> Ticket Cancellation
                <5> Booked Tickets
                <6> Add Charge
                <0> Sign Out
                           
                """);
    }
}