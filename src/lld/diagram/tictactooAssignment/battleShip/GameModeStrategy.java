package lld.diagram.tictactooAssignment.battleShip;

public interface GameModeStrategy {
    void setupGame(Board board);
    void takeTurn(Player player, Player opponent);
}

