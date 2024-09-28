package lld.diagram.tictactooAssignment.cardGame;

import java.util.*;

public interface WinningStrategy {
    Player determineWinner(List<Player> players);
    boolean validate(List<Player> players);
}