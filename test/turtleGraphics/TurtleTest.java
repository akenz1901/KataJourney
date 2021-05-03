package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    Pen pen;
    Pen shortPen;
    Turtle turtle;

    @BeforeEach
    void startAllWithThis() {
        pen = new Pen();
        shortPen = new Pen();
        turtle = new Turtle(pen);
    }

    @Test
    void turtleHasAPenTest() {

        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
        assertNotEquals(shortPen, turtle.getPen());
    }

    @Test
    void turtle_canMoveUpAndDown() {
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    void turtleCanMoveDown() {
        assertTrue(turtle.isPenUp());

        //when
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void turtleCanTurnRightWhileFacingEast() {
        assertSame(EAST, turtle.getCurrentDirection());


        turtle.turnRight();

        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingSouth() {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());


        turtle.turnRight();

        assertEquals(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingWest() {
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());


        turtle.turnRight();

        assertEquals(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightToEastWhileFacingNorth() {
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());


        turtle.turnRight();

        assertEquals(EAST, turtle.getCurrentDirection());
    }
//    @Test
//    void turtleCanMoveForwardFacingEast() {
//        assertSame(EAST, turtle.getCurrentDirection());
//
//        turtle.moveForwardBy(5);
//
//        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
//    }
//
//    @Test
//    void turtleCanMoveForwardFacingSouth() {
//        assertSame(EAST, turtle.getCurrentDirection());
//        turtle.moveForwardBy(5);
//
//        turtle.turnRight();
//        assertSame(SOUTH, turtle.getCurrentDirection());
//
//        turtle.moveForwardBy(5);
//        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
//    }
//    @Test
//    void turtleCanMoveForwardFacingWest() {
//        assertSame(EAST, turtle.getCurrentDirection());
//        turtle.moveForwardBy(5);
//
//        turtle.turnRight();
//
//        turtle.moveForwardBy(4);
//
//        turtle.turnRight();
//        assertSame(WEST, turtle.getCurrentDirection());
//
//        turtle.moveForwardBy(4);
//        assertEquals(new Position(3, 1), turtle.getCurrentPosition());
//
//    }
//
//    @Test
//    void turtleCanMoveForwardFacingNorth() {
//        assertSame(EAST, turtle.getCurrentDirection());
//        turtle.moveForwardBy(5);
//        turtle.turnRight();
//        turtle.moveForwardBy(4);
//
//        turtle.turnRight();
//        turtle.moveForwardBy(4);
//
//        turtle.turnRight();
//        assertSame(NORTH, turtle.getCurrentDirection());
//
//        turtle.moveForwardBy(4);
//        assertEquals(new Position(0, 1), turtle.getCurrentPosition());
//    }

    @Test
    void turtleCanTurnLeftFacingNorth() {
        assertSame(EAST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftFacingWest() {
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftFacingSouth() {
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());

    }

    @Test
    void turtleCanTurnLeftFacingEast() {
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanWriteWhileFacingEastTest() {
        //given
        turtle.movePenDown();
        SketchPad sketchPad = new SketchPad(20, 20);

        //when
        int numberOfSteps = 5;
        turtle.writeOn(sketchPad, numberOfSteps);
        //assert
        int counter = 0;
        var floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {
            assertEquals(1, floor[0][counter]);
            counter++;
        }
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingSouthTest() {
        turtle.turnRight();
        turtle.movePenDown();
        SketchPad sketchPad = new SketchPad(20, 20);

        //when
        int numberOfSteps = 5;
        turtle.writeOn(sketchPad, numberOfSteps);
        //assert
        int counter = 0;
        var floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {
            assertEquals(1, floor[counter][0]);
            counter++;
        }
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingWestTest(){
        SketchPad paper = new SketchPad(20, 20);
        int counter = 0;
        int numberOfSteps = 5;
        turtle.movePenDown();
        turtle.writeOn(paper, numberOfSteps);
        int[][] floor = paper.getFloor();
        while(counter<numberOfSteps){
            assertEquals(1, floor[0][counter]);
            counter++;
        }
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());

        turtle.turnRight();
        turtle.movePenDown();
        turtle.turnRight();
        turtle.writeOn(paper, numberOfSteps);
        counter = 0;
        while(counter<numberOfSteps){
            assertEquals(1, floor[0][counter]);
            counter++;
        }
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanWriteWhileFacingNorthTest(){
        turtle.movePenDown();
        turtle.turnRight();
        SketchPad paper = new SketchPad(20, 20);
        int counter = 0;
        int numberOfSteps = 5;
        turtle.writeOn(paper, numberOfSteps);
        int[][] floor = paper.getFloor();
        while(counter<numberOfSteps){
            assertEquals(1, floor[counter][0]);
            counter++;
        }
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());

        turtle.turnRight();
        turtle.movePenDown();
        turtle.turnRight();
        turtle.writeOn(paper, numberOfSteps);
        counter = 0;
        while(counter<numberOfSteps){
            assertEquals(1, floor[counter][0]);
            counter++;
        }
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());

    }

}