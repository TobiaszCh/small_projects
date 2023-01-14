import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class LogicGame {

    Scanner scanner = new Scanner(System.in);
    Random computer = new Random();
    Instruction instruction = new Instruction();
    boolean end = false;

    public void logic() {
        instruction.instruction();
        System.out.println("Start game");
        System.out.print("How much round: ");
        int round = scanner.nextInt();
        int restart = round;
        if (round > 0 && round < 11) {
            while (!end) {
                System.out.print("You: ");
                int me = scanner.nextInt();
                if (me == 5) {
                    round = restart;
                    System.out.println("New game");
                }
                int twoGamer = computer.nextInt(3);
                System.out.println("Two gamer " + twoGamer);
                round--;
                if ((me == 0 && twoGamer == 2) || (me == 1 && twoGamer == 0) || (me == 2 && twoGamer == 1)) {
                    System.out.println("I win! :)");
                } else if (me == twoGamer) {
                    System.out.println("Tie! :(");
                } else {
                    System.out.println("Two gamer win! :(");
                }
                if (round == 0 || Objects.equals(me, 4)) {
                    end = true;
                    System.out.println("Game is finished");
                }
            }
        }
    }
}
