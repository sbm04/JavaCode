package lld.lld3.TicTacToe;

import lld.lld3.TicTacToe.controller.GameController;
import lld.lld3.TicTacToe.models.*;
import lld.lld3.TicTacToe.strategies.ColWinningStrategy;
import lld.lld3.TicTacToe.strategies.RowWinningStrategy;

import java.util.*;

public class Client {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        GameController gc = new GameController();
        List<Player> players = new ArrayList<>();
        players.add( new HumanPlayer(1, "Shubham" , PlayerType.HUMAN, new Symbol('0')));
        players.add( new BotPlayer(2,"Bot",PlayerType.BOT,new Symbol('X'),BotDifficultyLevel.EASY));


        Game game = gc.startGame(3,players,List.of(new RowWinningStrategy(),new ColWinningStrategy()));
        gc.display(game);
        while(gc.checkState(game).equals(GameState.IN_PROGRESS)){
            gc.makeMove(game);
            gc.display(game);
            System.out.println("Do you want to Undo ? [Y/N]");
            String undoAnswer = scn.nextLine();
            if(undoAnswer.equals("Y")) {
                gc.Undo(game);
                System.out.println("Undo is successfull!");
                gc.display(game);
            }



        }
        if(gc.checkState(game).equals(GameState.SUCCESS)){
            System.out.println(gc.getWinner(game).getName() + " won the game");
        }else if(gc.checkState(game).equals(GameState.DRAW)){
            System.out.println("Game results in a draw");
        }

    }
}


// 1. Create your Models
// 2. Get ready your controller and basic interaction with the client
// 3. Make sure that every model has a constructor
// 4. Implement the functionalities one by one

// HW
// 1. Create other strategies : Try to implement the function before next class
// 2. Clean the code.