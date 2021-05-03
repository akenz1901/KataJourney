package TicTacToe;

import java.util.Arrays;

public class Table {
    private final String [][] playerFilling;
    public Table(int tableRow, int tableColumn){ playerFilling = new String[tableRow][tableColumn]; }

    public String[][] getOccupiedSpaces() {
        return playerFilling;
    }

    public static void main(String[] args) {
        Table table = new Table(3, 3);
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.playGame(1, 2, PlayerCharacter.O, table);
        System.out.println(Arrays.deepToString(table.getOccupiedSpaces()));
//        for (int count = 0; count < 1 ; ) {
//            String space = table.getOccupiedSpaces()[1][2];
//                System.out.println(space);
//                ++count;
//        }
    }
}
