package lld.diagram.tictactooAssignment.battleShip;

import java.util.*;

public class Grid {
    private List<List<Cell>> cells;
    private int size;

    public Grid() {
        this.size = 10;
        this.cells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell());
            }
            cells.add(row);
        }
    }

    public boolean isValidPlacement(Ship ship, Position position, Direction direction) {
        // Validate if the ship can be placed
        return true;
    }

    public void placeShip(Ship ship, Position position, Direction direction) {
        // Logic to place a ship on the grid using ship.getPositions()
    }

    public ShortResult receiveShot(Position position) {
       return null;
    }
}
