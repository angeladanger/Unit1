package app;

public class App {
    public static void main(String[] args) throws Exception {
        String person1 = "Tim";
        String person2 = "Bob";
        String verb1 = "run";
        String verb2 = "walk";
        String verb3 = "crawl";
        String food = "eggrolls";
        String dayOfWeek = "Friday";
        String place1 = "Tim's house";
        String place2 = "Bob's house";
        String adjective1 = "blue";
        String adjective2 = "round";

        System.out.println(person1 + "is a programmer who likes to" + verb1);
        System.out.println("Every" + dayOfWeek + "they make a" + adjective1 food + "for breakfast and" + verb2 + "at" + place1 + "with" + person2);
        System.out.println("Sometimes, they go to the" + adjective2 + place2 + "with" + person2 + "so that they can" + verb3 + "together.");
    }
}