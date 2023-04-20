import java.util.Scanner;

public class Test extends Passenger{

    Passengers passengers = new Passengers();
    Admin admin = new Admin();


    public void menu(){

        while (true) {


            Scanner input = new Scanner(System.in);

            int key = 0;

            firstMenu();
            secondMenu();
            key = input.nextInt();

            if (key == 1){
                passengers.signUp();
            }

            else if (key == 2){
                System.out.println("Enter Admin Username And Pass Otherwise You Are Passenger Enter Anything");
                String testUSer = input.next();
                if (testUSer.equals("USERADMIN")){
                    System.out.println("Enter Your Password");
                    String testPassword = input.next();
                    if (testPassword.equals("NIMA")){

                        while (key != 0) {
                            adminMenu();
                            key = input.nextInt();
                            if (key == 1) {
                                admin.addFlight();
                            }

                            else if (key == 2) {
                                admin.updateFlight();
                            }

                            else if (key == 3) {
                                admin.removeFlight();
                            }

                            else if (key == 4) {
                                admin.flightSchedule();
                            }
                        }
                    }
                }
                else if( key == 2){


                    int i;
                    i = passengers.signIn();
                    while (i == 500) {
                        System.out.println("THis Account Does not Exist");
                        i = passengers.signIn();
                    }

                    while (key != 0) {
                        passengerMenu();
                        key = input.nextInt();
                        if (key == 1) {
                            passengers.passenger[i].changePassword();
                        }

                        if (key == 2) {
                            admin.searchFlight1();
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
                    }
                }
            }
        }
    }

    public void firstMenu(){

        System.out.println("""
                
                .................................................
                .................................................
                ......WELCOME TO AIRLINE RESERVATION SYSTEM......
                
                """);
    }

    public void secondMenu(){
        System.out.println("""
                
                ..................MENU OPTION....................
                
                <1> SIGN UP
                <2> SIGN IN
                
                """);
    }

    public void adminMenu(){

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

    public void passengerMenu(){

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