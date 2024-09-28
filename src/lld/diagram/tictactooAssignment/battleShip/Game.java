package lld.diagram.tictactooAssignment.battleShip;


import java.util.*;
public class Game {
    private List<Player> players;
    private int currentTurn = 0;
    private GameRules rules;

    public Game(GameRules rules) {
        this.rules = rules;
        this.players = new ArrayList<>();
    }

    public Game startGame() {
        players.add(new Player());
        players.add(new Player());
        currentTurn = 0;
        return this;
    }

    public Player switchTurn() {
        return null;
    }

    public boolean isGameOver() {
        return currentTurn == players.size() - 1;
    }
}
