package cardGame;

import org.junit.jupiter.api.Test;
import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
        void playerHasanId(){
        Player player = new Player ("Michael");
        assertEquals ( "Michael", player.getName() );
    }

    @Test
    void playerHasCards(){
        Player player = new Player ("Michael");
        player.addCard(CardGame.createWhotCardOfValue(2));
        player.addCard(CardGame.createWhotCardOfValue(2));
        player.addCard(CardGame.createWhotCardOfValue(2));


        assertEquals ( 3, player.getNumberOfCards() );
    }
}