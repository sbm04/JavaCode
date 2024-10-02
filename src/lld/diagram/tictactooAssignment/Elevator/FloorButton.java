package lld.diagram.tictactooAssignment.Elevator;

public class FloorButton implements Button {
    private boolean isPressed;
    private Direction direction;
    private Floor floor;

    public FloorButton(Floor floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
        this.isPressed = false;
    }

    @Override
    public void press() {
        this.isPressed = true;
        // Logic to register the request with the system
        //floor.notifyObservers("Floor " + floor.getFloorNumber() + " " + direction + " button pressed.");
    }

    public boolean isPressed() {
        return isPressed;
    }

    public Direction getDirection() {
        return direction;
    }

    public Floor getFloor() {
        return floor;
    }

    public void reset() {
        this.isPressed = false;
    }
}