public class RpsRunner {
    public static void main(String[] args) {
        LogicGame logicGame = new LogicGame();
        try{
            logicGame.logic();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
