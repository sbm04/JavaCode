package lld.diagram.tictactooAssignment.Elevator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Client {
    public static void main(String[] args) {
        // Create elevators
        Elevator elevator1 = createElevator(1);
        Elevator elevator2 = createElevator(2);

        // Create floors
        List<Floor> floors = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // 10-floor building
            floors.add(new Floor(i));
        }

        // Create building
        Building building = new Building(Arrays.asList(elevator1, elevator2), floors);

        // Simulate a user pressing a button
        User user = new User(1);
        Floor groundFloor = floors.get(0);
        user.pressFloorButton(groundFloor.getUpButton());

        // Simulate processing requests
        elevator1.processNextRequest();
        elevator2.processNextRequest();
    }

    private static Elevator createElevator(int id) {
        // Initialize control panel with floor buttons and safety buttons
        List<Button> buttons = new ArrayList<>();
        // Assuming 10 floors
        // Note: Floor references will be set when creating Floors
        // Here, we initialize buttons without floor references
        for (int i = 0; i < 10; i++) {
            buttons.add(new FloorButton(null, Direction.UP));
            buttons.add(new FloorButton(null, Direction.DOWN));
        }

        OverloadProtection overloadProtection = new OverloadProtection(1000); // max weight 1000kg
        RequestHandlerStrategy strategy = new NearestFloorFirstStrategy();
        Mode mode = new Mode();

        // Temporary Elevator instance to pass to control panel buttons
        Elevator tempElevator = new Elevator(id, null, null, overloadProtection, strategy, mode);
        ElevatorControlPanelImpl controlPanel = new ElevatorControlPanelImpl(buttons, tempElevator);

        // Create the actual Elevator with proper control panel and queue management
        QueueManagementImpl queueManagement = new QueueManagementImpl(strategy, tempElevator);
        Elevator elevator = new Elevator(id, controlPanel, queueManagement, overloadProtection, strategy, mode);

        // Assign the Elevator instance to control panel
        controlPanel = new ElevatorControlPanelImpl(buttons, elevator);

        // Create and add safety buttons
        SafetyButton emergencyButton = new EmergencyButton(elevator);
        SafetyButton alarmButton = new AlarmButton(elevator);
        controlPanel.pressSafetyButton(emergencyButton); // Example usage
        controlPanel.pressSafetyButton(alarmButton);     // Example usage

        return elevator;
    }


    /*
    * Summary of Improvements
   Single Responsibility Principle (SRP): The Elevator class has been decomposed into smaller classes
   * like ElevatorMovement, ElevatorStatus, and ElevatorSafety, each handling specific functionalities.

   Open/Closed Principle (OCP): The use of the Strategy pattern (RequestHandlerStrategy interface)
   * allows for easy extension of request handling strategies without modifying existing code.

Liskov Substitution Principle (LSP): Interfaces and abstract classes are designed to be
* easily substitutable, ensuring that subclasses can replace superclasses without altering program correctness.

Interface Segregation Principle (ISP): Separate interfaces for different button types (SafetyButton, Button)
* ensure that classes are not forced to implement methods they do not use.

Dependency Inversion Principle (DIP): High-level modules (Elevator) depend on abstractions (QueueManagement, RequestHandlerStrategy)
* rather than concrete implementations, enhancing flexibility.

Observer Pattern: Implemented to allow Floor instances to notify Elevator instances of button presses,
* facilitating decoupled and scalable interactions.

Entity Relationships: Clear aggregation between Building and its components (Elevators and Floors),
* and composition within Floor and FloorButton.

User Interaction: Introduction of the User class to represent passengers interacting with the elevator system.

Safety and Maintenance: Enhanced safety features through EmergencyButton and AlarmButton,
* and maintenance modes managed via the Mode class.

Overload Protection: Robust OverloadProtection class to monitor and prevent elevator operation under excessive load.*/
}



