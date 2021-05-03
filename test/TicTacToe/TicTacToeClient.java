package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeClient {

    Table table;
    TicTacToe ticTacToe;
    Player player;

    @BeforeEach
    void performAllThis(){
        player = new Player("Mercy");
        table = new Table(3,3);
        ticTacToe = new TicTacToe(table, player);
    }

    @Test
    void ticTacToe_cannotBeNull(){
        assertNotNull(ticTacToe);
    }
    @Test
    void ticTacToe_canCreateCharacter(){
        ticTacToe.ChooseCharacter(PlayerCharacter.X);
        assertEquals(PlayerCharacter.X, ticTacToe.getCharacter());
    }
    @Test
    void playerCanplayGame(){
        Table table = new Table(3, 3);
        ticTacToe.ChooseCharacter(PlayerCharacter.X);

        player.play(1,1, PlayerCharacter.X, table);
        assertEquals(PlayerCharacter.X, ticTacToe.getCharacter());

            String[][] space = table.getOccupiedSpaces();
            for(int counter = 0;counter<1;) {
                assertEquals("X", space[1][1]);
                ++counter;
            }
    }
    @Test
    void playerCanPlayWhileChoosingCharacter(){
        Table table = new Table(3, 3);
        ticTacToe.ChooseCharacter(PlayerCharacter.O);

        player.play(1,2, PlayerCharacter.O, table);
        assertEquals(PlayerCharacter.O, ticTacToe.getCharacter());

        String[][] space = table.getOccupiedSpaces();
        for(int counter = 0;counter<1;) {
            assertEquals("O", space[1][2]);
            System.out.print(Arrays.deepToString(table.getOccupiedSpaces()));
            counter++;
        }
    }
    @Test
    void ticTacToe_canTakeTurn(){
        Player play = new Player("Me");
        ticTacToe.playerTurn(play, PlayerCharacter.X);

        assertEquals(play, ticTacToe.getTurn());
    }
}
