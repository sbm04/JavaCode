package lld.lld3.TicTacToe.strategies;

import lld.lld3.TicTacToe.models.Board;
import lld.lld3.TicTacToe.models.Cell;
import lld.lld3.TicTacToe.models.CellState;
import lld.lld3.TicTacToe.models.Move;
import java.util.*;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row:board.getGrid()){
            for(Cell cell:row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(new Cell(cell.getRow(),cell.getCol()),null);
                }
            }
        }

        return null;
    }
}
