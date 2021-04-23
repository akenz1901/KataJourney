package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private final Pen pen;

    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen) {

        this.pen = pen;
        currentDirection = EAST;
        currentPosition = new Position(0,0);
    }

    public Pen getPen() {
        return pen;
    }

    public void movePenUp() {
        pen.setIsUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setIsUp(false);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {

        switch (currentDirection){
            case EAST -> changeCurrentDirection(SOUTH);
            case SOUTH -> changeCurrentDirection(WEST);
            case WEST -> changeCurrentDirection(NORTH);
            case NORTH -> changeCurrentDirection(EAST);
        }
    }
    private void changeCurrentDirection(Direction newDirection){
        currentDirection = newDirection;
    }

    public void moveForwardBy(int numberOfSteps) {
        numberOfSteps = numberOfSteps-1;
        switch (currentDirection){
            case EAST -> currentPosition.increaseColumnPositionBy(numberOfSteps);
            case SOUTH -> currentPosition.increaseRowPositionBy(numberOfSteps);
            case WEST -> currentPosition.decreaseColumnPositionBy(numberOfSteps);
            case NORTH -> currentPosition.decreaseRowPositionBy(numberOfSteps);
        }
    }
    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> changeCurrentDirection(NORTH);
            case NORTH -> changeCurrentDirection(WEST);
            case WEST -> changeCurrentDirection(SOUTH);
            case SOUTH -> changeCurrentDirection(EAST);
        }
    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if(!isPenUp()){
            int counter = 0;
            switch (currentDirection) {
                case EAST, WEST -> {
                    while (counter < numberOfSteps) {
                        sketchPad.getFloor()[currentPosition.getRowPosition()][currentPosition.getColumnPosition() + counter] = 1;
                        counter++;
                    }
                    moveForwardBy(numberOfSteps);
                }
                case SOUTH,NORTH -> {
                    int rowPosition = currentPosition.getRowPosition();
                    int columnPosition = currentPosition.getColumnPosition();
                    while (counter < numberOfSteps) {
                        sketchPad.getFloor()[rowPosition + counter][columnPosition] = 1;
                        counter++;
                    }
                    moveForwardBy(numberOfSteps);
                }
            }
        }
    }
}







//        if(currentDirection.equals(EAST)){ currentDirection = SOUTH;}
//        else if(currentDirection.equals(SOUTH)){ currentDirection = WEST;}
//        else if(currentDirection.equals(WEST)){ currentDirection = NORTH;}
//        else if(currentDirection.equals(NORTH)){ currentDirection = EAST;}