package app;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
     Scanner input = new Scanner(System.in);

    int firstDigit;
    int secondDigit;
    String operation;

    System.out.println("PLEASE INSERT FIRST AND SECOND NUMBER.");
    firstDigit = input.nextInt();
    secondDigit = input.nextInt();

    System.out.println("PLEASE INSERT AN OPERATION.");
    operation = input.next();

    if (operation.equals("+")){
        System.out.println(firstDigit + secondDigit);
    }
    if (operation.equals("-")){
        System.out.println(firstDigit - secondDigit);
    }
    if (operation.equals("*")){
        System.out.println(firstDigit * secondDigit);
    }
    if (operation.equals("/")){
        System.out.println(firstDigit / secondDigit);
    }

    }
}