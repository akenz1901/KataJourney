package TicTacToe;

public class Player {
    private final String playerName;

    public Player(String playerName){
        this.playerName = playerName;
    }

    public void play(int row, int column,PlayerCharacter playerCharacter) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.playGame(row, column, playerCharacter);
    }

    public String getPlayerName(){
        return playerName;
    }
}
