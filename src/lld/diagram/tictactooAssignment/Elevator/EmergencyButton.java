package lld.diagram.tictactooAssignment.Elevator;

public class EmergencyButton implements SafetyButton {
    private Elevator elevator;

    public EmergencyButton(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void trigger() {
        elevator.triggerEmergencyStop();
    }
}
