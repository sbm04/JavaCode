package lld.diagram.tictactooAssignment.cardGame;

import java.util.*;

public class Deck {
    private final List<ICard> deck = new ArrayList<>();

    public void shuffle() {

    }

    public ICard dealCard() {
        return deck.isEmpty() ? null : deck.remove(deck.size() - 1);
    }

    public int remainingCards() {
        return deck.size();
    }
}
