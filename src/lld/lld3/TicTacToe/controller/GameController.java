package lld.lld3.TicTacToe.controller;

import lld.lld3.TicTacToe.models.Game;
import lld.lld3.TicTacToe.models.Player;
import lld.lld3.TicTacToe.strategies.WinningStrategy;

import java.util.*;


public class GameController {

    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ) {

        return Game.getBuilder().
                setDimension(dimension).
                setPlayers(players).
                setWinningStrategies(winningStrategies).
                build();
    }
}
