package lld.diagram.tictactooAssignment.cardGame;

public class Client {
    public static void main(String[] args) {
        /*
        * Here some improvement point


                        1. Improvements: The Card class could be more detailed, including suit and rank attributes.
                        * Suggestions: Consider adding a Hand class to represent a player's hand, separate from the Player class.

                        2. it be to add future scope requirement
                        Improvements: The Game class could be more extensible.
                        Suggestions: Consider using strategy pattern for game rules to make it easier to add new game variations in the future.
                        *  Also, implement an interface for Card to allow different types of cards in future expansions.

                        3. the designs follow SOLID principles
                        Improvements: The Open/Closed and Liskov Substitution principles could be better applied.
                        * Suggestions: Create an abstract Card class or interface to allow for different card types.
                        * Implement a GameRule interface to make it easier to add or modify game rules without changing the Game class.


                        4. the design is using Interfaces, Abstract classes correctly

                         Improvements: There's a lack of interfaces and abstract classes in the current design.
                         *  Suggestions: Introduce an ICard interface or an abstract Card class to allow for different card implementations.
                         *  Create a GameRule interface to define game-specific rules and behaviors.

                        5 design is creating relationships between the entities like Inheritance, Composition, Aggregation etc

                        Improvements: Inheritance relationships could be better utilized.
                        Suggestions: Consider creating a hierarchy for different types of cards or players.
                        *  Use aggregation for the relationship between Player and Card instead of direct composition.
        * */
    }
}
