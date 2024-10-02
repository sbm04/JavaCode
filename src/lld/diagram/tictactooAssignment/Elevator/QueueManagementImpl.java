package lld.diagram.tictactooAssignment.Elevator;

import java.util.*;

public class QueueManagementImpl implements QueueManagement {
    private List<Request> requestList;
    private RequestHandlerStrategy requestHandlerStrategy;
    private Elevator elevator;

    public QueueManagementImpl(RequestHandlerStrategy requestHandlerStrategy, Elevator elevator) {
        this.requestList = new ArrayList<>();
        this.requestHandlerStrategy = requestHandlerStrategy;
        this.elevator = elevator;
    }

    @Override
    public void addRequest(Request request) {
        requestList.add(request);
        optimizeQueue();
    }

    @Override
    public void optimizeQueue() {
        //requestHandlerStrategy.optimizeQueue(requestList, elevator.getCurrentFloor(), elevator.getDirection());
    }

    @Override
    public Request getNextRequest() {
        if (!requestList.isEmpty()) {
            return requestList.remove(0);
        }
        return null;
    }

    @Override
    public boolean hasRequests() {
        return !requestList.isEmpty();
    }
}