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
    void startAllWithThis(){
        pen = new Pen();
        shortPen = new Pen();
        turtle = new Turtle(pen);
    }

    @Test
    void turtleHasAPenTest(){

        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
        assertNotEquals(shortPen, turtle.getPen());
    }

    @Test
    void turtle_canMoveUpAndDown(){
        turtle.movePenUp();
        assertTrue( turtle.isPenUp());
    }
    @Test
    void turtleCanMoveDown(){
        assertTrue(turtle.isPenUp());

        //when
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEast(){
        assertSame(EAST, turtle.getCurrentDirection());


        turtle.turnRight();

        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingSouth(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());


        turtle.turnRight();

        assertEquals(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingWest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());


        turtle.turnRight();

        assertEquals(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightToEastWhileFacingNorth(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());


        turtle.turnRight();

        assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanMoveForwardFacingEast(){
        assertSame(EAST, turtle.getCurrentDirection());

        turtle.moveForwardBy(5);

        assertEquals(new Position(0,5), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveForwardFacingSouth(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());

        turtle.moveForwardBy(5);
        assertEquals(new Position(5,0), turtle.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingWest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());

        turtle.moveForwardBy(4);
        assertEquals(new Position(0, -4), turtle.getCurrentPosition());

    }
    @Test
    void turtleCanMoveForwardFacingNorth(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());

        turtle.moveForwardBy(3);
        assertEquals(new Position(-3, 0), turtle.getCurrentPosition());
    }

}
