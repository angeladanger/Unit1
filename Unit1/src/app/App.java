package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "yellow";
        boolean answer = true


        while (count <= 15) {
            System.out.println("The count is " + count);
            count = count + 5;
        }

        System.out.println("count finished");

        while (color == "yellow"); {
            System.out.println("The color is" + color);
            color = "pink";
        }

        System.out.println("color finished");

        while (answer == true); {
            System.out.println("Do we live in Minnesota?" + answer);
            answer = false;
        }

        System.out.println("answer finished");
     }
}