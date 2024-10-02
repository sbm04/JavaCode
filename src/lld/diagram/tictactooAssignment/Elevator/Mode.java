package lld.diagram.tictactooAssignment.Elevator;
public class Mode implements SeheduledMaintainMode, EnergyEfficiencyMode {
    private Schedule schedule;
    private boolean isEnergyModeActive;

    @Override
    public Schedule setMaintenance(Elevator elevator) {
        schedule = new Schedule();
        schedule.setElevator(elevator);
        // Set other schedule details
        //System.out.println("Maintenance mode activated for Elevator " + elevator.getId());
        return schedule;
    }

    @Override
    public void removeMaintenance(Elevator elevator) {
        schedule = null;
        //System.out.println("Maintenance mode removed for Elevator " + elevator.getId());
    }

    @Override
    public void activate() {
        isEnergyModeActive = true;
        System.out.println("Energy efficiency mode activated.");
        optimizeElevatorOperation();
    }

    @Override
    public void deactivate() {
        isEnergyModeActive = false;
        System.out.println("Energy efficiency mode deactivated.");
    }

    @Override
    public void optimizeElevatorOperation() {
        if (isEnergyModeActive) {
            // Add energy optimization logic
            System.out.println("Optimizing elevator operation for energy efficiency.");
        }
    }

    public boolean isEnergyModeActive() {
        //return isEnergyModeActive;
        return true;
    }
}