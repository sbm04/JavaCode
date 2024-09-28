package lld.diagram.tictactooAssignment.battleShip;

public class PlayerActions {
    private Player player;
    private Grid ownGrid;
    private Grid opponentTrackingGrid;

    public PlayerActions(Player player, Grid ownGrid, Grid opponentTrackingGrid) {
        this.player = player;
        this.ownGrid = ownGrid;
        this.opponentTrackingGrid = opponentTrackingGrid;
    }

    public void fireShot(Grid opponentGrid) {
        // Logic to fire a shot
    }

    public void placeShips() {
        // Logic for placing ships on the ownGrid
    }
}
