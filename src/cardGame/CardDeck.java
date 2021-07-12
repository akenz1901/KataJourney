package cardGame;

import cardGame.Exceptions.StackOverFlowException;
import cardGame.Exceptions.StackUnderFlow;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;


public class CardDeck {
    private static CardGame[] cards;
    private static int lastPushedLocation = -1;

    public CardDeck(int numberOfCard) {
        cards = new CardGame[numberOfCard];
    }

    public static int getSize() {
        return cards.length;
    }

    public static void push(CardGame card) {
        if (isFull ()) throw new StackOverFlowException( "Card deck is full" );
        lastPushedLocation++;
        cards[lastPushedLocation] = card;

    }

    public CardGame peek() {
        if (isEmpty ()) throw new StackUnderFlow( "Card deck is empty" );
        return cards[lastPushedLocation];
    }


    public CardGame pop() {
        if (isEmpty ()) throw new StackUnderFlow ( "Card deck is empty" );

        return cards[lastPushedLocation--];
    }

    public boolean isEmpty() {
        return lastPushedLocation == -1;
    }

    public static boolean isFull() {

        return (lastPushedLocation == getSize ()-1);
    }

    public void shuffle() {
        SecureRandom generalRandom = new SecureRandom();
        CardGame card;
        int random = generalRandom.nextInt(cards.length);
        for (int i = 0; i < cards.length; i++) {
            card = cards[i];
            cards[i] = cards[random];
            cards[random] = card;
        }
        Collections.shuffle(Arrays.asList(cards));
    }

    public static void populateCards() {
        CardDeck cardDeck = new CardDeck(54);
        for (Suit suit:Suit.values()) {
            switch (suit) {
                case TRIANGLE -> {
                    for (int i = 1; i <= 14; i++) {
                        if (i == 9 || i == 6)
                            continue;
                        push(CardGame.createTriangleCardOfValue(i));
                        System.out.println(cardDeck);
                    }
                    System.out.println(suit);
                }
                case CIRCLE -> {
                    for (int i = 1; i <= 14; i++) {
                        if (i == 9 || i == 6)
                            continue;
                        push(CardGame.createCircleCardOfValue(i));
                        System.out.println(cardDeck);
                    }
                    System.out.println(suit);
                }
                case STAR -> {
                    for (int i = 1; i <= 14; i++) {

                        if (i == 9 || i == 6 || i == 10 || i == 12 || i == 14 || i == 13 || i == 11)
                            continue;
                        push(CardGame.createStarCardOfValue(i));
                        System.out.println(cardDeck);
                    }
                    System.out.println(suit);
                }
                case CROSS -> {
                    for (int i = 1; i <= 14; i++) {

                        if (i == 9 || i == 6 || i == 8 || i == 12 || i == 4)
                            continue;
                        push(CardGame.createCrossCardOfValue(i));
                        System.out.println(cardDeck);
                    }
                    System.out.println(suit);
                }
                case SQUARE -> {
                    for (int i = 1; i <= 14; i++) {

                        if (i == 9 || i == 6 || i == 8 || i == 12 || i == 4)
                            continue;
                        push(CardGame.createSquareCardOfValue(i));
                        System.out.println(cardDeck);
                    }
                    System.out.println(suit);
                }
                case WHOT -> {
                    for (int i = 1; i <= 5; i++) {
                        push(CardGame.createWhotCardOfValue(i));
                    }
                }
            }
        }
    }
}

