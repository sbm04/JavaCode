package lld.diagram.tictactooAssignment.battleShip;

import java.util.*;

public abstract class AbstractShip implements Ship {
    protected int size;
    protected int hitCount;
    protected List<Position> positions;

    public AbstractShip(int size) {
        this.size = size;
        this.hitCount = 0;
        this.positions = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getHitCount() {
        return hitCount;
    }

    @Override
    public boolean isSunk() {
        return hitCount >= size;
    }

    @Override
    public void hit() {
        hitCount++;
    }

    @Override
    public List<Position> getPositions() {
        return positions;
    }

    @Override
    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
}

