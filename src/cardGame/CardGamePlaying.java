package cardGame;

public class CardGamePlaying {

    private final int numberOfPlayers;
    public CardGamePlaying(int numberOfPlayers, int numberOfCardsToDeal) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
}
