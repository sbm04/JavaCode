package lld.diagram.tictactooAssignment.Elevator;

public class ElevatorMovement {
    private Elevator elevator;

    public ElevatorMovement(Elevator elevator) {
        this.elevator = elevator;
    }

    public void moveToFloor(int targetFloor) {
//        if (elevator.isInEmergencyMode() || elevator.getOverloadProtection().isOverloaded()) {
//            System.out.println("Cannot move the elevator due to emergency or overload.");
//            return;
//        }
//
//        System.out.println("Elevator " + elevator.getId() + " moving from floor " + elevator.getCurrentFloor() + " to floor " + targetFloor);
//        elevator.setDirection(targetFloor > elevator.getCurrentFloor() ? Direction.UP : Direction.DOWN);
//
//        // Simulate movement
//        // In a real system, movement would be asynchronous and involve timing
//        elevator.setCurrentFloor(targetFloor);
//        System.out.println("Elevator " + elevator.getId() + " arrived at floor " + targetFloor);
//
//        // Notify that floor has been reached
//        elevator.setDirection(Direction.IDLE);
    }
}
