package lld.lld3.TicTacToe.models;

import lld.lld3.TicTacToe.strategies.WinningStrategy;

import java.util.*;

public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;
    private int nextPlayerIndex;
    private List<Move > moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;
    private Game(Builder builder) {
        board= new Board(builder.dimension);
        players = builder.players;
        winningStrategies = builder.winningStrategies;
        winner=null;
        nextPlayerIndex=0;
        moves= new ArrayList<>();
        gameState=GameState.IN_PROGRESS;


    }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
    public void displayBoard(){
        //board.display();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        public Builder setDimension(int dimension){
            this.dimension = dimension;
            return this;

        }
        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        private void validate(){

        }
        public Game build(){
            return new Game(this);
        }


    }

}
