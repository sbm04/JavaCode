package lld.diagram.tictactooAssignment.battleShip;

public class Cell {
    boolean isOccupied;
    boolean isHit;
    Ship ship;
    public void markHit(Ship ship) {
        this.ship = ship;
        isHit = true;
    }
    public void markMiss(Ship ship) {
        this.ship = ship;
        isOccupied = true;
    }

}
