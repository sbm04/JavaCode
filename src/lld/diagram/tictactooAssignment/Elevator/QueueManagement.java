package lld.diagram.tictactooAssignment.Elevator;

public interface QueueManagement {
    void addRequest(Request request);
    void optimizeQueue();
    Request getNextRequest();
    boolean hasRequests();
}
