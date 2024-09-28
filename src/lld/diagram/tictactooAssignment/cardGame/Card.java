package lld.diagram.tictactooAssignment.cardGame;

public class Card implements ICard {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public Rank getRank() {
        return rank;
    }

    @Override
    public int calculateScore() {
        return rank.ordinal() + 2; // Example logic
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
