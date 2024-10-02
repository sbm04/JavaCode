package lld.diagram.tictactooAssignment.Elevator;

public class OverloadProtection {
    private int currentWeight;
    private int maxWeight;

    public OverloadProtection(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public boolean isOverloaded() {
        return currentWeight > maxWeight;
    }

    public void checkOverload() {
        if (isOverloaded()) {
            System.out.println("Elevator is overloaded, cannot operate.");
        }
    }

    public void addWeight(int weight) {
        currentWeight += weight;
    }

    public void removeWeight(int weight) {
        currentWeight -= weight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}