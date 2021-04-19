package turtleGraphics;

public class Position {
    private int rowPosition;
    private int columnPosition;
    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition+=numberOfSteps;
    }
    public void increaseRowPositionBy(int numberOfRowSteps){
        rowPosition+=numberOfRowSteps;
    }
    public void decreaseColumnPositionBy(int numberOfSteps){
        columnPosition-=numberOfSteps;
    }
    public void decreaseRowPositionBy(int numberOfRowSteps) {
        rowPosition-=numberOfRowSteps;
    }

    @Override
    public String toString() {
        String toString = "Position\n";
        toString += "Current Row Position " + rowPosition + "\n";
        toString += "Current Column Position " + columnPosition;
        return toString;//        return String.format("Current Row Position %d\nCurrent Column Position %d", rowPosition,columnPosition);
//        return "Position{" + "rowPosition=" + rowPosition + ", columnPosition=" + columnPosition + '}';
    }
    @Override
    public boolean equals(Object anotherPosition){

        if(anotherPosition.getClass() != this.getClass()) {
            return false;
        }
        Position convertedPosition = (Position) anotherPosition;
        boolean columnAreEqual = convertedPosition.columnPosition == this.columnPosition;
        boolean rowsAreEqual = convertedPosition.rowPosition == this.rowPosition;
        return columnAreEqual && rowsAreEqual;

    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
}
