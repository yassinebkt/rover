package domain;

import org.junit.Test;

import javax.print.attribute.standard.PDLOverrideSupported;

import static org.junit.Assert.*;

public class RoverTest {

    @Test
    public void hasPosition() {
        Rover rover = new Rover();
        assertFalse(rover.hasPosition(new Position(3,4)));
    }

    @Test
    public void reportPosition() {
    }

    @Test
    public void processInstructions() {
    }

    @Test
    public void dropRover() {
    }

    @Test
    public void testDropRover() {
    }

    @Test
    public void testDropRover1() {
    }
}