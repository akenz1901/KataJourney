package cardGame;

import cardGame.Exceptions.StackOverFlowException;
import cardGame.Exceptions.StackUnderFlow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

class CardDeckTest {
    private CardDeck cardDeck;
    @BeforeEach
    void beforeEachTest(){
        cardDeck = new CardDeck (4);
    }
    @Test
        void cardDeckHasFixedSize(){
        assertEquals ( 4,cardDeck.getSize () );
    }

    @Test
    void oncePushed_elementPushedShouldBeLast(){
        CardGame card = new CardGame ( CLUB, 2);
        cardDeck.push(card);
        assertSame ( card,cardDeck.peek() );
    }

    @Test
    void pushedTwice_popOnce_peek_shouldReturnFirstElement(){
        CardGame firstCard = new CardGame ( CLUB, 2);
        CardGame secondCard = new CardGame ( DIAMOND,4 );
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        CardGame poppedCard = cardDeck.pop();
        assertSame ( secondCard, poppedCard );
        assertSame ( firstCard,cardDeck.peek() );
    }

    @Test
    void popEmptyCardDEckThrowsException(){
        assertTrue (cardDeck.isEmpty() );
        assertThrows ( StackUnderFlow.class, cardDeck::pop );
    }
    @Test
    void pushIntoFullDeck_throwsStackOverFlowException(){
        CardGame firstCard = new CardGame ( CLUB, 2);
        CardGame secondCard = new CardGame ( DIAMOND,4 );
        CardGame thirdCard = new CardGame ( HEART, 2);
        CardGame fourthCard = new CardGame ( SPADE,4 );
        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        cardDeck.push(thirdCard);
        cardDeck.push(fourthCard);
        assertTrue ( cardDeck.isFull() );
        assertThrows ( StackOverFlowException.class, ()-> cardDeck.push(firstCard) );
    }
    @Test
    void pickingEmptyCardDeck_throwsStackUnderflowException(){
        assertTrue (cardDeck.isEmpty() );
        assertThrows ( StackUnderFlow.class, cardDeck::peek );
    }
}