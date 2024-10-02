package lld.diagram.tictactooAssignment.Elevator;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String statusUpdate);
}
