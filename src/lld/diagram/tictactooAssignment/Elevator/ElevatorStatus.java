package lld.diagram.tictactooAssignment.Elevator;

public class ElevatorStatus {
    private Elevator elevator;

    public ElevatorStatus(Elevator elevator) {
        this.elevator = elevator;
    }

    public void updateDirection(Direction newDirection) {
        elevator.setDirection(newDirection);
    }

    public Direction getDirection() {
        return elevator.getDirection();
    }

    public int getCurrentFloor() {
        return elevator.getCurrentFloor();
    }
}