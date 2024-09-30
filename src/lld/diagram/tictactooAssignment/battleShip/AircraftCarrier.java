package lld.diagram.tictactooAssignment.battleShip;

public class AircraftCarrier extends AbstractShip implements AircraftCarrierRule {
    public AircraftCarrier() {
        super(5); // Aircraft Carrier size is 5
    }


    @Override
    public void shipmove() {
        System.out.println("Aircrat movement rule");
    }

    @Override
    public void move() {
       System.out.println(" ");
    }
}