package lld.diagram.tictactooAssignment.Elevator;


import java.util.List;

public abstract class ElevatorControlPanel {
    protected List<Button> buttonList;

    public ElevatorControlPanel(List<Button> buttons) {
        this.buttonList = buttons;
    }

    public abstract void pressButton(int floorNumber);

    public abstract void pressSafetyButton(SafetyButton safetyButton);
}
