package app;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
     Scanner input = new Scanner(System.in);

     int myInt = 183726073;

        System.out.println("Please enter the password.");
        String password = input.nextLine();

        if (myInt == 183726073) {
            System.out.println("ACCESS GRANTED");
    }
        else{
            System.out.println("ACCESS DENIED");
        }
    }
}