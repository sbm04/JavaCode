package lld.diagram.tictactooAssignment.Elevator;

public class User {
    private int id;

    public User(int id) {
        this.id = id;
    }

    public void pressFloorButton(FloorButton button) {
        button.press();
    }

    public int getId() {
        return id;
    }
}
