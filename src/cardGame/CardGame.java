package cardGame;

import static cardGame.Suit.*;

public class CardGame{
    private final int value;
    private final Suit suit;

    private CardGame(Suit suit, int value) {
        this.value = value;
        this.suit = suit;
    }

    public static CardGame createSquareCardOfValue(int value) {
        return new CardGame(SQUARE, value);
    }

    public static CardGame createTriangleCardOfValue(int value) {
        return new CardGame(TRIANGLE, value);
    }

    public static CardGame createStarCardOfValue(int value) {
        return new CardGame(STAR, value);
    }

    public static CardGame createCircleCardOfValue(int value) {
        return new CardGame(CIRCLE, value);
    }

    public static CardGame createCrossCardOfValue(int value) {
        return new CardGame(CROSS, value);
    }

    public static CardGame createWhotCardOfValue(int whotValue) {
        return new CardGame(WHOT, whotValue);
    }  public Suit getSuit() {
        return suit;
    }

    public int getValue() {

        return value;
    }

    @Override
    public String toString() {
        return getValue() + " of " + suit.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())){
            return false;
        }
        CardGame cardToCompare = (CardGame) obj;
        return this.value == cardToCompare.value || this.suit == cardToCompare.suit;
    }
}

// if (value < 1 || value > 14){
//        throw new InvalidCardValueException(value + " Is Not a Valid Card Value");
//        }
