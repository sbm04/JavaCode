package lld.diagram.tictactooAssignment.battleShip;

public interface IGame {
    void startGame();
    void playTurn(Player player, Player opponent);
    boolean isGameOver();
}
