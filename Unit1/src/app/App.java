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
        dog1.age = 3;
        dog1.furColor = "White";
        dog1.birthday = "03/22";
        dog1.yearBorn = 2017;

        System.out.println("This dog is named " + dog1.name + ". " + dog1.name + " is of " + dog1.breed + " breed. " + dog1.name + " is " + dog1.age + " years old. Their fur color is " + dog1.furColor + ". Their birthday is on " + dog1.birthday + " and was born in " + dog1.yearBorn + ".");

        System.out.println( );


        dog2.name = "Shibu";
        dog2.breed = "Shiba Inu";
        dog2.age = 1;
        dog2.furColor = "orange-tan";
        dog2.birthday = "06/20";
        dog2.yearBorn = 2019;

        System.out.println("This dog is named " + dog2.name + ". " + dog2.name + " is of " + dog2.breed + " breed. " + dog2.name + " is " + dog2.age + " years old. Their fur color is " + dog2.furColor + ". Their birthday is on " + dog2.birthday + " and was born in " + dog2.yearBorn + ".");

        System.out.println(  );


        dog3.name = "Cloudy";
        dog3.breed = "Samoyed";
        dog3.age = 2;
        dog3.furColor = "white";
        dog3.birthday = "02/15";
        dog3.yearBorn = 2018;

        System.out.println("This dog is named " + dog3.name + ". " + dog3.name + " is of " + dog3.breed + " breed. " + dog3.name + " is " + dog3.age + " years old. Their fur color is " + dog3.furColor + ". Their birthday is on " + dog3.birthday + " and was born in " + dog3.yearBorn + ".");

        System.out.println(  );


    
    }
}