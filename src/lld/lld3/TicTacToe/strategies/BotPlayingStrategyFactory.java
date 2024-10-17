package lld.lld3.TicTacToe.strategies;

import lld.lld3.TicTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficulty) {
        if(difficulty.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
