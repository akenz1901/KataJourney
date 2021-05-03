package TicTacToe;
public class TicTacToe {

    private PlayerCharacter character;
    private Player player;


    public TicTacToe(Table table, Player player) {
    }

    public TicTacToe(){}

    public void ChooseCharacter(PlayerCharacter character) {
        this.character = character;
    }
    public PlayerCharacter getCharacter() {
        return character;
    }



    public void playGame(int row, int column, PlayerCharacter character, Table table) {

        if(character.equals(PlayerCharacter.X)){
            this.character = PlayerCharacter.X;
            for(int counter = 0; counter < 1; ){
                table.getOccupiedSpaces()[row][column] = "X";
                ++counter;
                System.out.println(table.getOccupiedSpaces()[row][column]);
            }
        }
        else if(character.equals(PlayerCharacter.O)){
            this.character = PlayerCharacter.O;
            for (int counter = 0; counter < 1; ) {
                table.getOccupiedSpaces()[row][column] = "O";
                ++counter;
                System.out.println(table.getOccupiedSpaces()[row][column]);
            }
        }

    }

    public void playerTurn(Player name, PlayerCharacter character) {
        player = name;


    }

    public Player getTurn() {
        return player;
    }
}

