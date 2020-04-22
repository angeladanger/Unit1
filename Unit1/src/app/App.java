package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Start first loop");

        for (int i = 20; i >= 0; i = i - 1){
            System.out.println(i);
            if (i == 10){
                for (int j = 0; j < 7; j++){
                    System.out.println(i);
                }
            }
        }
        System.out.println("End first loop");
        System.out.println("Start second loop");
        for (int i = 4; i <= 36; i = i + 4){
            if (i % 4 == 0)
            
            System.out.println("Hey!");
            System.out.println(i);
        }
    }
}