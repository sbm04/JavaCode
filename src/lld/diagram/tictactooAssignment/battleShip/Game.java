package lld.diagram.tictactooAssignment.battleShip;


import lld.diagram.tictactooAssignment.cardGame.GameState;

import java.util.*;
public class Game implements IGame{
    private List<Player> players;
    private int currentTurn = 0;
    private Board board;
    private GameRules rules;
    private GameState state;
    private GameModeStrategy gameMode;

    public Game(GameRules rules) {
        this.rules = rules;
        this.players = new ArrayList<>();
    }

    public void startGame() {
        players.add(new Player());
        players.add(new Player());
        currentTurn = 0;

    }

    @Override
    public void playTurn(Player player, Player opponent) {

    }


    public boolean isGameOver() {
        return currentTurn == players.size() - 1;
    }
}
