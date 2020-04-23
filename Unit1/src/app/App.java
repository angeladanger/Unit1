package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Double or single digit?");

        for (int i = 20; i >= 1; i = i - 1) {
            if (i > 9){
                System.out.println(i + " is a double digit");
            }
            else {
                System.out.println(i + " is a single digit");
            }
        }
        System.out.println("Nice!");
        System.out.println("Fast Food");

        for (int i = 1; i <= 10; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println("Fries");
            }
            else {
                System.out.println("Burgers");
            }
        }
        System.out.println("Nice!");
    }
}