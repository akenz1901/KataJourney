package cardGame;

public enum Suit {
    STAR, TRIANGLE, CIRCLE, CROSS, SQUARE, WHOT ;


    @Override
    public String toString() {
        return switch (this){
            case CIRCLE -> "Circle";
            case CROSS -> "Cross";
            case TRIANGLE -> "Triangle";
            case STAR -> "Star";
            case SQUARE -> "Square";
            case WHOT -> "Whot";
        };
    }
}
