package lld.lld3.TicTacToe.strategies;


import lld.lld3.TicTacToe.models.Board;
import lld.lld3.TicTacToe.models.Move;

public interface WinningStrategy {

    public boolean checkWinner(Board board, Move move);
    public void handleUndo(Board board, Move move);
}