package lld.diagram.tictactooAssignment.cardGame;

import java.util.List;

public class SimpleWinningStrategy implements WinningStrategy {

    @Override
    public Player determineWinner(List<Player> players) {
        return null;
    }

    @Override
    public boolean validate(List<Player> players) {
        return false;
    }
}