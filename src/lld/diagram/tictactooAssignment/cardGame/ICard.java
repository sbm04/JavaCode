package lld.diagram.tictactooAssignment.cardGame;

public interface ICard {
    Suit getSuit();
    Rank getRank();
    int calculateScore(); // You can provide default score calculation logic based on rank.
}
