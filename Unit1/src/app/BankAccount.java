package app;
import java.util.Scanner;

public class BankAccount{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String name;
        String password;
        int balance;
        int choice;
        int withdrawal;

        System.out.println("Welcome to your new bank account!");
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("Please create a password.");
        password = input.nextLine();
        System.out.println("How much money are you starting with?");
        balance = input.nextInt();

        System.out.println("Account created. Please log in.");

        System.out.println("What is your name?");
        name = input.next();
        System.out.println("Enter your password.");
        password = input.next();

        if (name.equals(name) && password.equals(password)){
            System.out.println("Access granted! What would you like to do?");
            System.out.println("Press 1 to check balance, press 2 to withdraw money, press 3 to change password.");
            choice = input.nextInt();

        if ((choice > 3) || (choice < 1)){
            System.out.println("ERROR! please enter a valid choice.");
        }
        else if (choice == 1){
            System.out.println("Your balance is: " + balance);
        }
        else if (choice == 2){
            System.out.println("How much would you like to withdraw?");
            withdrawal = input.nextInt();
            System.out.println("This is your new balance:");
            System.out.println(balance - withdrawal);
        }
        else if (choice == 3){
            String changedPassword;
            System.out.println("Please enter your old password.");
            password = input.next();

            System.out.println("Now create a new password.");
            changedPassword = input.nextLine();

            System.out.println("Password changed!");
        }
        }
        else{
            System.out.println("Wrong information! Please try again.");
        }


    }
}