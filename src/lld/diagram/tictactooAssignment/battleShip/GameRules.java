package lld.diagram.tictactooAssignment.battleShip;

import java.util.*;

public class GameRules {
    private int gridSize;
    private List<Ship> ships;

    public GameRules(int gridSize, List<Ship> ships) {
        this.gridSize = gridSize;
        this.ships = ships;
    }

    public int getGridSize() {
        return gridSize;
    }

    public List<Ship> getShips() {
        return ships;
    }
}


