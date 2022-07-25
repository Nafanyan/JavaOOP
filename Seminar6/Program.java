package Seminar6;

public class Program {
    public static void main(String[] args) {
        Game game = new Game(45, true);
        game.startGame();
        game.gameHistory();
        game.loadSave();
        //
    }
}
