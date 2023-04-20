import java.util.ArrayList;
import java.util.Scanner;

public class Passengers {

    Scanner input = new Scanner(System.in);
    public Passenger[] passenger = new Passenger[500];

    // methods

    public void signUp(){

        for (int i = 0; i < 500; i++) {

            if (passenger[i] == null) {
                passenger[i] = new Passenger();
                System.out.println("Create Your Username");
                passenger[i].setUserName(input.nextLine());
                System.out.println("Create Your Password");
                passenger[i].setPassword(input.nextLine());
                break;
            }
        }

    }     // completed
    public int signIn() {

        System.out.println("Enter Your Username");
        String inputUsername = input.nextLine();

        System.out.println("Enter Your Password");
        String inputPassword = input.nextLine();

        int i;
        for (i = 0; i < 500; i++) {
            if (!(passenger[i] == null) && passenger[i].getUserName().equals(inputUsername) && passenger[i].getPassword().equals(inputPassword))
            break;
        }
        return i;
    }     // completed
}