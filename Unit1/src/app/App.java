package app;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
     Scanner input = new Scanner(System.in);

    System.out.println("PLEASE INSERT A NOUN");
    String noun1 = input.nextLine();
    System.out.println("PLEASE INSERT A VERB");
    String verb1 = input.nextLine();
    System.out.println("PLEASE INSERT AN ADJECTIVE");
    String adjective1 = input.nextLine();
    System.out.println("PLEASE INSERT AN ADJECTIVE AND A NOUN");
    String adjectiveAndNoun = input.nextLine();
    System.out.println("PLEASE INSERT A NUMBER");
    String number1 = input.nextLine();
    System.out.println("PLEASE INSERT A FOOD");
    String food1 = input.nextLine();
    System.out.println("PLEASE INSERT A TIME");
    String time1 = input.nextLine();
    System.out.println("PLEASE INSERT A SECOND ADJECTIVE");
    String adjective2 = input.nextLine();
    System.out.println("PLEASE INSERT ANOTHER VERB");
    String verb2 = input.nextLine();
    System.out.println("PLEASE INSERT A LOCATION");
    String location1 = input.nextLine();

    System.out.println("Yesterday, " + noun1 + " and I " + verb1 + " to the " + adjective1 + " restaurant. On our way there, we saw a " + adjectiveAndNoun + " which caught our attention.");
    System.out.println("We proceeded into the restaurant. As we ordered, there were about " + number1 + " items on the menu. I was very excited to see that " + food1 + " was on the menu.");
    System.out.println("It was around " + time1 + " when we decided to go home. The food I ate today was " + adjective2 + " but very good nonetheless.");
    System.out.println("When I arrived at home, I " + verb2 + " into " + location1 + " and knocked out. The end!");






    }
}