package lld.diagram.tictactooAssignment.Elevator;

public class ElevatorSafety {
    private Elevator elevator;

    public ElevatorSafety(Elevator elevator) {
        this.elevator = elevator;
    }

    public void triggerEmergencyStop() {
        elevator.setInEmergencyMode(true);
        // Additional logic for emergency stop
        System.out.println("Elevator " + elevator.getId() + " is in emergency mode.");
    }

    public void resetEmergencyMode() {
        elevator.setInEmergencyMode(false);
        System.out.println("Elevator " + elevator.getId() + " has exited emergency mode.");
    }
}