import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets Start the game!.....");
        System.out.println("Number for the Choices" + "\n" + "0-->Scissor" + "\n" + "1-->Rock" + "\n" + "2-->Paper");
        int choice = sc.nextInt();
        int max = 2;
        int min = 0, point = 0;
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;

        // if (random==choice) {

        // System.out.println("Winner of rock paper scissor game!");
        // } else {
        // System.out.println("You loss the game!" + ((int)(Math.random() * range) +
        // min));

        // }

        for (int i = 0; i <= 10; i++) {
            if (choice == random) {
                point++;
                System.out.println("Hey! you scored 1 point , your total point is-->" + point + " Enter next choice!");

                choice = sc.nextInt();
                random = (int) (Math.random() * range) + min;

            } else {
                System.out.println("Enter next choice!");

                choice = sc.nextInt();
                random = (int) (Math.random() * range) + min;
                continue;

            }

        }

        if (point > 5) {
            System.out.println("You scored-->" + point);
            System.out.println("Winner of the game!");
        } else {
            System.out.println("You scored-->" + point);
            System.out.println("You loose the game!" + "\n" + "........Run to start new game");

        }
    }
}
