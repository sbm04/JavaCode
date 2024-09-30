package lld.diagram.tictactooAssignment.battleShip;

public class GameState {
    private boolean gameOver;
    private int currentTurn;

    public GameState() {
        this.gameOver = false;
        this.currentTurn = 0;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void switchTurn() {
        currentTurn = (currentTurn + 1) % 2;
    }
}
