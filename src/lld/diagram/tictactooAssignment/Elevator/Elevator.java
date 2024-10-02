package lld.diagram.tictactooAssignment.Elevator;


public class Elevator implements Observer {
    private int id;
    private int currentFloor;
    private Direction direction;
    private QueueManagement queueManagement;
    private OverloadProtection overloadProtection;
    private ElevatorControlPanel controlPanel;
    private RequestHandlerStrategy requestHandlerStrategy;
    private Mode mode;
    private boolean inEmergencyMode;

    private ElevatorMovement movement;
    private ElevatorStatus status;
    private ElevatorSafety safety;

    public Elevator(int id, ElevatorControlPanel controlPanel, QueueManagement queueManagement,
                    OverloadProtection overloadProtection, RequestHandlerStrategy requestHandlerStrategy, Mode mode) {
        this.id = id;
        this.currentFloor = 0; // assuming ground floor
        this.direction = Direction.IDLE;
        this.controlPanel = controlPanel;
        this.queueManagement = queueManagement;
        this.overloadProtection = overloadProtection;
        this.requestHandlerStrategy = requestHandlerStrategy;
        this.mode = mode;
        this.inEmergencyMode = false;

        this.movement = new ElevatorMovement(this);
        this.status = new ElevatorStatus(this);
        this.safety = new ElevatorSafety(this);
    }

    public int getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void moveToFloor(int floor) {
        movement.moveToFloor(floor);
    }

    public void addRequest(Request request) {
        queueManagement.addRequest(request);
    }

    public void setMaintenanceMode() {
        mode.setMaintenance(this);
    }

    public void setEnergyEfficiencyMode() {
        mode.activate();
    }

    public void deactivateEnergyEfficiencyMode() {
        mode.deactivate();
    }

    public void handleOverload() {
        overloadProtection.checkOverload();
    }

    public void triggerEmergencyStop() {
        safety.triggerEmergencyStop();
    }

    public OverloadProtection getOverloadProtection() {
        return overloadProtection;
    }

    @Override
    public void update(String statusUpdate) {
        // Handle observer updates, e.g., new floor requests
        // Parse the statusUpdate to extract floor number and direction
        // For simplicity, assume format "Floor X Y button pressed."
        System.out.println("Elevator " + id + " received update: " + statusUpdate);
        String[] parts = statusUpdate.split(" ");
        if (parts.length >= 4) {
            try {
                int floorNumber = Integer.parseInt(parts[1]);
                Direction dir = Direction.valueOf(parts[2].toUpperCase());
                addRequest(new Request(floorNumber, dir, RequestType.EXTERNAL));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid status update format.");
            }
        }
    }

    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }

    public boolean isInEmergencyMode() {
        return inEmergencyMode;
    }

    public void setInEmergencyMode(boolean inEmergencyMode) {
        this.inEmergencyMode = inEmergencyMode;
    }

    public void processNextRequest() {
        if (queueManagement.hasRequests()) {
            Request nextRequest = queueManagement.getNextRequest();
            moveToFloor(nextRequest.getFloorNumber());
            // Reset the floor button if it was an external request
            // Additional logic to handle internal/external requests
        } else {
            System.out.println("Elevator " + id + " is idle at floor " + currentFloor);
        }
    }
}
