package lld.diagram.tictactooAssignment.battleShip;

import java.util.*;

public class Board {
    private Grid grid;

    public Board() {
        this.grid = new Grid();
    }

    public Grid getGrid() {
        return grid;
    }

    public boolean placeShip(Ship ship, Position position, Direction direction) {
        return grid.isValidPlacement(ship, position, direction);
    }

    public ShortResult fireShot(Position position) {
        return grid.receiveShot(position);
    }
}
