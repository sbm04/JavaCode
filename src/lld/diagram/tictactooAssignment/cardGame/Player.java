package lld.diagram.tictactooAssignment.cardGame;

import java.util.*;

public class Player {
    private final Integer id;
    private final String name;
    private final List<ICard> hand = new ArrayList<>();

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void receiveCard(ICard card) {
        hand.add(card);
    }

    public List<ICard> showHand() {
        return Collections.unmodifiableList(hand);
    }
}