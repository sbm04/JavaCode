package lld.diagram.tictactooAssignment.battleShip;

public class AIPlayerStrategy implements GameModeStrategy {
    @Override
    public void setupGame(Board board) {
        // AI places ships automatically
    }

    @Override
    public void takeTurn(Player player, Player opponent) {
        // AI fires shots at random or based on a strategy
    }
}
