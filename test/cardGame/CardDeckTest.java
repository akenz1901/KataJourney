package cardGame;

import cardGame.Exceptions.StackOverFlowException;
import cardGame.Exceptions.StackUnderFlow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardDeckTest {
    private CardDeck cardDeck;
    @BeforeEach
    void beforeEachTest(){
        cardDeck = new CardDeck (4);
    }
    @Test
        void cardDeckHasFixedSize(){
        assertEquals ( 4, CardDeck.getSize() );
    }

    @Test
    void oncePushed_elementPushedShouldBeLast(){
        CardGame card = CardGame.createCircleCardOfValue(3);
        CardDeck.push(card);
        assertSame ( card,cardDeck.peek() );
    }

    @Test
    void pushedTwice_popOnce_peek_shouldReturnFirstElement(){
        CardGame firstCard = CardGame.createSquareCardOfValue(1);
        CardGame secondCard = CardGame.createCrossCardOfValue(2);
        CardDeck.push(firstCard);
        CardDeck.push(secondCard);
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
        CardGame firstCard = CardGame.createSquareCardOfValue(2);
        CardGame secondCard = CardGame.createCircleCardOfValue(7);
        CardGame thirdCard = CardGame.createCrossCardOfValue(3);
        CardGame fourthCard = CardGame.createTriangleCardOfValue(12);
        CardDeck.push(firstCard);
        CardDeck.push(secondCard);
        CardDeck.push(thirdCard);
        CardDeck.push(fourthCard);
        assertTrue ( CardDeck.isFull() );
        assertThrows ( StackOverFlowException.class, ()-> CardDeck.push(firstCard) );
    }
    @Test
    void peekingEmptyCardDeck_throwsStackUnderflowException(){
        assertTrue(cardDeck.isEmpty());
        assertThrows (StackUnderFlow.class, cardDeck::peek );
    }
    @Test
    void cardCanBeShuffled(){
        CardGame firstCard = CardGame.createTriangleCardOfValue(4);
        CardGame secondCard = CardGame.createCircleCardOfValue(7);
        CardGame thirdCard = CardGame.createCrossCardOfValue(3);
        CardGame fourthCard = CardGame.createSquareCardOfValue(2);
        CardDeck.push(firstCard);
        CardDeck.push(secondCard);
        CardDeck.push(thirdCard);
        CardDeck.push(fourthCard);

        assertSame(fourthCard, cardDeck.peek());
        assertEquals(4, CardDeck.getSize());

        cardDeck.shuffle();
        assertNotSame(fourthCard, cardDeck.peek());
    }
    @Test
    void cardCanBePopulation(){
        CardDeck.populateCards();
        assertEquals(54, CardDeck.getSize());
    }
}