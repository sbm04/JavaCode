package lld.diagram.tictactooAssignment.cardGame;

import java.util.*;

public class Game {
    private final Deck deck;
    private final List<Player> players;
    private Player winner;
    private GameState gameState;
    private WinningStrategy winningStrategy;

    public Game(Deck deck, List<Player> players, WinningStrategy strategy) {
        this.deck = deck;
        this.players = players;
        this.gameState = GameState.Not_Started;
        this.winningStrategy = strategy;
    }

    public void startGame() {
        gameState = GameState.In_progress;
        // Shuffle, deal cards, etc.
    }

    public Player getWinner() {
        if (gameState == GameState.Completed) {
            return winner;
        }
        return null;
    }

    public void endGame() {
        winner = winningStrategy.determineWinner(players);
        gameState = GameState.Completed;
    }

    public boolean validateRule() {
        return winningStrategy.validate(players);
    }
}

//*Key SOLID Improvements:
//Single Responsibility Principle (SRP): Each class has one responsibility. ICard abstracts card behavior, Game manages the gameplay, and WinningStrategy handles winning logic.
//Open/Closed Principle (OCP): The design allows for adding new types of cards or winning strategies without modifying existing classes.
//Liskov Substitution Principle (LSP): ICard implementations (e.g., Card) can be used interchangeably.
//Interface Segregation Principle (ISP): Clients like Game only depend on methods they actually use (via WinningStrategy and ICard).
//Dependency Inversion Principle (DIP): High-level modules like Game depend on abstractions (e.g., WinningStrategy) rather than concrete classes.
// */
