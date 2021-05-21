package cardGame;

import cardGame.Exceptions.InvalidCardValueException;

public class CardGame{
    private final int value;
    private final Suit suit;

    public CardGame(Suit suit, int value) {
        if (value < 1 || value > 13){
            throw new InvalidCardValueException(value + " Is Not a Valid Card Value");
        }
        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getValue() {

        return switch (this.value) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> ""+value;
        };
    }
}
