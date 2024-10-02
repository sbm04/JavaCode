package lld.diagram.tictactooAssignment.Elevator;

public class AlarmButton implements SafetyButton {
    private Elevator elevator;

    public AlarmButton(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void trigger() {
        //System.out.println("Alarm button pressed on Elevator " + elevator.getId());
        // Additional alarm logic here
    }
}