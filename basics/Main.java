import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(2);
        clock();
    }
    public static String pluralize(String word, int number){
        if (number == 0 || number > 1){
            return word + "s";

        }else {
            return word;
        }
    }
    public static void flipNHeads(int n){

        int adding= 0;
        int flips = 0;
        int headsCounter = 0;

        while(adding !=n) {
            double random = Math.random();
            if (random < .5) {
                System.out.println("TAILS");
                adding = 0;
                flips++;
            }
            if (random >=.5) {
                System.out.println("HEADS");
                adding++;
                flips++;
            }
        }
        System.out.println("It took " + flips + " flips to get " + n + " heads in a row.");
    }

    public static void clock() throws InterruptedException {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            int second = now.getSecond();
            Thread.sleep(1000);
            System.out.println(time);

        }

    }
}
