package lld.diagram.tictactooAssignment.Elevator;


import  java.util.*;
public class ElevatorControlPanelImpl extends ElevatorControlPanel {
    private Elevator elevator;

    public ElevatorControlPanelImpl(List<Button> buttons, Elevator elevator) {
        super(buttons);
        this.elevator = elevator;
    }

    @Override
    public void pressButton(int floorNumber) {
        // Find and press the floor button
        for (Button button : buttonList) {
            if (button instanceof FloorButton) {
                FloorButton floorButton = (FloorButton) button;
                if (floorButton.getFloor().getFloorNumber() == floorNumber) {
                    floorButton.press();
                    elevator.addRequest(new Request(floorNumber, Direction.IDLE, RequestType.INTERNAL));
                    break;
                }
            }
        }
    }

    @Override
    public void pressSafetyButton(SafetyButton safetyButton) {
        safetyButton.trigger();
        if (safetyButton instanceof EmergencyButton) {
            elevator.triggerEmergencyStop();
        }
    }
}
