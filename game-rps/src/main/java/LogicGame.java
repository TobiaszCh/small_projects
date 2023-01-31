import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class LogicGame {

    Scanner scanner = new Scanner(System.in);
    Random computer = new Random();
    GameLogicElements gameLogicElements = new GameLogicElements();
    Instruction instruction = new Instruction();
    boolean end = false;

    public void logic() throws WrongNumber {
        instruction.instruction();
        System.out.println("Start game");
        System.out.print("How much round: ");
        int scoreC = 0;
        int scoreM = 0;
        int round = scanner.nextInt();
        int restart = round;
        if (round > 0 && round < 10) {
            while (!end) {
                System.out.print("You: ");
                int me = scanner.nextInt();
                if (me >= 0 && me < 6) {
                    if (me == 4) {
                        round = restart;
                        System.out.println("New game");
                    }
                    int twoGamer = computer.nextInt( 3);
                    System.out.println("Two gamer " + twoGamer);
                    round--;
                    if ((me == 0 && twoGamer == 2) || (me == 1 && twoGamer == 0) || (me == 2 && twoGamer == 1)) {
                        scoreM++;
                        System.out.println("I win! :)");
                    } else if (me == twoGamer) {
                        System.out.println("Tie! :(");
                    } else if (me == 2 || me == 0 || me == 1) {
                        scoreC++;
                        System.out.println("Two gamer win! :(");
                    }
                    if (round == 0 || Objects.equals(me, 3)) {
                        end = true;
                        System.out.println("Game is finished");
                        gameLogicElements.winner(scoreM, scoreC);
                    }
                }
                else {
                    throw new WrongNumber();
                }
            }
        }
        else {
            throw new WrongNumber();
        }
    }
}
