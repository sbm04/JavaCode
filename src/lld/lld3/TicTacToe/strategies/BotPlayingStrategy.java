package lld.lld3.TicTacToe.strategies;

import lld.lld3.TicTacToe.models.Board;
import lld.lld3.TicTacToe.models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
