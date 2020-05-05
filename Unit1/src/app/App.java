package app;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
     Scanner input = new Scanner(System.in);

     System.out.println("How many countries are in the world?");
     String countriesInWorld = input.nextLine();

     if (countriesInWorld.equals("195")){
         System.out.println("CORRECT");
     }
     else{
         System.out.println("INCORRECT");
     }

     System.out.println("What is the capital of America?");
     String capitalAmerica = input.nextLine();

     if (countriesInWorld.equals("Washington DC")){
         System.out.println("CORRECT");
     }
     else{
         System.out.println("INCORRECT");
     }

     System.out.println("How old is the continent of North America?");
     String ageOfAmerica = input.nextLine();

     if (ageOfAmerica.equals("200 million years old")){
         System.out.println("CORRECT");
     }
     else{
         System.out.println("INCORRECT");
     }


    }
}