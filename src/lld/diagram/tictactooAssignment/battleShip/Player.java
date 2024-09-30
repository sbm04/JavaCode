package lld.diagram.tictactooAssignment.battleShip;

public class Player implements GameObserver{
    private Fleet fleet;
    private Grid shipGrid;
    private Grid trackingGrid;
    private PlayerActions actions;

    public Player() {
        this.fleet = new Fleet();
        this.shipGrid = new Grid();
        this.trackingGrid = new Grid();
        this.actions = new PlayerActions(this, shipGrid, trackingGrid);
    }

    public Player takeTurn(Player opponent) {
        actions.fireShot(opponent.getShipGrid());
        return opponent;
    }

    public void placeShips() {
        actions.placeShips();
    }

    public boolean hasLost() {
        //return fleet.isFleetSunk();
        return false;
    }

    public Grid getShipGrid() {
        return shipGrid;
    }

    @Override
    public void update(GameState state) {
        if (state.isGameOver()) {
            System.out.println("Game Over");
        }
    }
}

