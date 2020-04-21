package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("starting loop 1...");

        for (int i = 0; i <= 19; i++) {
            if (i % 1 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("end of loop 1.");

        System.out.println("starting loop 2...");

        for (int i = -1; i <= 19; i = i + 3) {
            if (i % 1 == 0) {
                System.out.println(i + 3);
                System.out.println(i + 3);
            }
        }

        System.out.println("end of loop 2.");
    }
}