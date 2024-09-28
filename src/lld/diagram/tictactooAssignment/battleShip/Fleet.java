package lld.diagram.tictactooAssignment.battleShip;

import java.util.*;

public class Fleet {
    private List<Ship> ships;

    public Fleet() {
        ships = new ArrayList<>();
        ships.add(new AircraftCarrier());
        ships.add(new Battleship());
        ships.add(new Submarine());
        ships.add(new PatrolBoat());
    }

    public boolean isFleetSunk() {
        return ships.stream().allMatch(Ship::isSunk);
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }
}

