package TicTacToe;

import java.util.Arrays;

public class Table {
    private final String [][] playerFilling;
    public Table(int tableRow, int tableColumn){ playerFilling = new String[tableRow][tableColumn]; }

    public String[][] getOccupiedSpaces() {
        return playerFilling;
    }

    }

