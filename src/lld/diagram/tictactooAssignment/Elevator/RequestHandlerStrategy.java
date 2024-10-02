package lld.diagram.tictactooAssignment.Elevator;
import java.util.*;
public interface RequestHandlerStrategy {
    void optimizeQueue(List<Request> requestList, int currentFloor, Direction currentDirection);
}
