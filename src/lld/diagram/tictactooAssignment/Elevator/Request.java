package lld.diagram.tictactooAssignment.Elevator;

import java.net.Authenticator;

public class Request {
    private int floorNumber;
    private Direction direction;
    private RequestType requestorType;

    public Request(int floorNumber, Direction direction, RequestType requestorType) {
        this.floorNumber = floorNumber;
        this.direction = direction;
        this.requestorType = requestorType;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Direction getDirection() {
        return direction;
    }

    public RequestType getRequestorType() {
        return requestorType;
    }
}