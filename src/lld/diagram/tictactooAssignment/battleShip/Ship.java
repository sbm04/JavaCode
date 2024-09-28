package lld.diagram.tictactooAssignment.battleShip;

import java.util.*;

public interface Ship {
    int getSize();
    int getHitCount();
    boolean isSunk();
    void hit();
    List<Position> getPositions();
    void setPositions(List<Position> positions);
}
