public class GameLogicElements {

    public void winner(int gamer, int computer) {
        if (gamer < computer) {
            System.out.println("Me computer win wiyh you: " + gamer + " : " + computer + " !!!");
        } else if (gamer > computer) {
            System.out.println("I win with computer: " + computer + " : " + gamer + " !!!");
        } else {
            System.out.println("We have tie : " + computer + " : " + gamer + ":)");
        }
    }

}
