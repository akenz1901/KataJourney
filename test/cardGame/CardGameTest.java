package cardGame;

import cardGame.Exceptions.*;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {
    @Test
        void diamondCanBeCreated(){
            CardGame card = new CardGame (DIAMOND, 2);
            assertSame ( DIAMOND, card.getSuit() );
    }
    @Test
    void spadeCanBeCreated(){
        CardGame card = new CardGame ( SPADE, 2);
        assertSame ( SPADE, card.getSuit() );
    }

    @Test
    void heartCanBeCreated(){
        CardGame card = new CardGame ( HEART, 2);
        assertSame ( HEART, card.getSuit() );
    }
    @Test
    void clubsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 2);
        assertSame ( CLUB, card.getSuit() );
    }
    @Test
    void aceCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 1);
        assertEquals ( "Ace", card.getValue() );
    }

    @Test
    void jackCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 11);
        assertEquals ( "Jack", card.getValue() );
    }

    @Test
    void queenCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 12);
        assertEquals ( "Queen", card.getValue() );
    }

    @Test
    void kingCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 13);
        assertEquals ( "King", card.getValue() );
    }

    @Test
    void numericCardsCanBeCreated(){
        CardGame card = new CardGame ( CLUB, 8);
        assertEquals ( "8", card.getValue() );
    }

    @Test
    void invalidCardExceptionIsThrownWhenValueIsInvalid(){
        assertThrows ( InvalidCardValueException.class, ()-> new CardGame (DIAMOND, 14) );
        assertThrows ( InvalidCardValueException.class, ()-> new CardGame (DIAMOND, 0) );
    }
}