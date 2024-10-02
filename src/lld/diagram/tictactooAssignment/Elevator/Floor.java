package lld.diagram.tictactooAssignment.Elevator;

import java.util.*;

public class Floor implements Subject {
    private int floorNumber;
    private FloorButton upButton;
    private FloorButton downButton;
    private List<Observer> observers;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.upButton = new FloorButton(this, Direction.UP);
        this.downButton = new FloorButton(this, Direction.DOWN);
        this.observers = new ArrayList<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public FloorButton getUpButton() {
        return upButton;
    }

    public FloorButton getDownButton() {
        return downButton;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String statusUpdate) {
        for (Observer observer : observers) {
            observer.update(statusUpdate);
        }
    }

    public void pressUpButton() {
        upButton.press();
    }

    public void pressDownButton() {
        downButton.press();
    }
}
