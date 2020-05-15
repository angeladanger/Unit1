package app;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.name = "Billy";
        dog1.breed = "Beagle";
        dog1.age = 5;

        System.out.println("This dog is named " + dog1.name);
        System.out.println(dog1.name + " is of " + dog1.breed + " breed");
        System.out.println(dog1.name + " is " + dog1.age + " years old.");

        System.out.println( );


        dog2.name = "Shibu";
        dog2.breed = "Shiba Inu";
        dog2.age = 7;

        System.out.println("This dog is named " + dog2.name);
        System.out.println(dog2.name + " is of " + dog2.breed + " breed");
        System.out.println(dog2.name + " is " + dog2.age + " years old.");

        System.out.println( );


        dog3.name = "Cloudy";
        dog3.breed = "Samoyed";
        dog3.age = 3;

        System.out.println("This dog is named " + dog3.name);
        System.out.println(dog3.name + " is of " + dog3.breed + " breed");
        System.out.println(dog3.name + " is " + dog3.age + " years old.");

    
    }
}