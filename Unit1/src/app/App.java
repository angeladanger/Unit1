package app;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 22; i <= 28; i = i+3) {
            System.out.println(+i);
        }
        for (int m = 2; m <= 32; m = m*2) {
            System.out.println(+m);
        }
        for (int i = 3; i >= -81; i = i * -i) {
            System.out.println(+i);
        }
        for (int i = 50; i >= 10; i = i - 5) {
            System.out.println(+i);
        }
        for (int i = 1; i <= 12; i = i+1) {
            System.out.println(+i);
        }
        for (int i = 2; i <= 81; i = i^(2)) {
            System.out.println(+i);
        }


    }
}