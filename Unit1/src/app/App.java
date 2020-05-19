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

        System.out.println(  );


        dog3.name = "Cloudy";
        dog3.breed = "Samoyed";
        dog3.age = 3;

        System.out.println("This dog is named " + dog3.name);
        System.out.println(dog3.name + " is of " + dog3.breed + " breed");
        System.out.println(dog3.name + " is " + dog3.age + " years old.");

        System.out.println(  );
        


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.name = "Sally";
        person1.age = 23;
        person1.heightInFeet = 6;
        person1.eyeColor = "green";
        person1.hairColor = "blonde";
        person1.hobby = "playing sports";

        System.out.println("This person is named " + person1.name + ", they are " + person1.age + " years old, they are " + person1.heightInFeet + " feet tall, they have " + person1.eyeColor + " eyes and " + person1.hairColor + " hair. Their hobby is " + person1.hobby + ".");

        System.out.println(  );

        person2.name = "Billy";
        person2.age = 18;
        person2.heightInFeet = 5;
        person2.eyeColor = "brown";
        person2.hairColor = "black";
        person2.hobby = "playing instruments";

        System.out.println("This person is named " + person2.name + ", they are " + person2.age + " years old, they are " + person2.heightInFeet + " feet tall, they have " + person2.eyeColor + " eyes and " + person2.hairColor + " hair. Their hobby is " + person2.hobby + ".");

        System.out.println(  );

        person3.name = "Bob";
        person3.age = 26;
        person3.heightInFeet = 6;
        person3.eyeColor = "blue";
        person3.hairColor = "brown";
        person3.hobby = "building computers";

        System.out.println("This person is named " + person3.name + ", they are " + person3.age + " years old, they are " + person3.heightInFeet + " feet tall, they have " + person3.eyeColor + " eyes and " + person3.hairColor + " hair. Their hobby is " + person3.hobby + ".");

        System.out.println(  );
    
    }
}