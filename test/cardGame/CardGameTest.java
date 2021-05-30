package cardGame;

import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {
    @Test
    void squareCanBeCreated(){
        CardGame card = CardGame.createSquareCardOfValue(3);
        assertEquals(3, card.getValue());
        assertEquals(SQUARE, card.getSuit());
    }

    @Test
    void triangleCanBeCreated(){
        CardGame card = CardGame.createTriangleCardOfValue(3);
        assertSame(3, card.getValue());
        assertEquals(TRIANGLE, card.getSuit());
    }

    @Test
    void starCanBeCreated(){
        CardGame card =  CardGame.createStarCardOfValue(3);
        assertSame(3, card.getValue());
        assertEquals(STAR, card.getSuit());
    }
    @Test
    void circleCanBeCreated(){
        CardGame card = CardGame.createCircleCardOfValue(4);
        assertSame(4, card.getValue());
        assertEquals(CIRCLE, card.getSuit());
    }
    @Test
    void crossCanBeCreated(){
        CardGame card = CardGame.createCrossCardOfValue(4);
        assertSame(4, card.getValue());
        assertEquals(CROSS, card.getSuit());
    }
    @Test
    void whotCrossCanBeCreated(){
        CardGame card = CardGame.createWhotCardOfValue(20);
        assertSame(20, card.getValue());
        assertEquals(WHOT, card.getSuit());
    }


    @Test
    void testSameCardValueEquals(){
        CardGame circle = CardGame.createCircleCardOfValue(3);
        CardGame cross = CardGame.createCrossCardOfValue(3);
        assertEquals(cross, circle);

    }
    @Test
    void testNotSameObject(){
        CardGame kingOfSpade = CardGame.createCircleCardOfValue(3);
        CardDeck cardDeck = new CardDeck(3);

        assertNotEquals(cardDeck, kingOfSpade);
    }
}



//    @Test
//    void invalidCardExceptionIsThrownWhenValueIsInvalid(){
//        assertThrows ( InvalidCardValueException.class, ()-> new CardGame (STAR, 15) );
//        assertThrows ( InvalidCardValueException.class, ()-> new CardGame (STAR, 0) );
//    }
//@Test
//void displayCard(){
//    CardGame diamond = new CardGame(STAR,13);
//    assertEquals("King of Diamond", diamond.toString());
//
//    CardGame heart = new CardGame(TRIANGLE,12);
//    assertEquals("Queen of Heart", heart.toString());
//
//    CardGame spade = new CardGame(CROSS,1);
//    assertEquals("Ace of Spade", spade.toString());
//
//    CardGame club = new CardGame(CIRCLE,11);
//    assertEquals("Jack of Club", club.toString());
//}