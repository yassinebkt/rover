package domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class PositionTest {

    @Test
    public void isOnPlateau() {
        Plateau plateau = new Plateau(5,5);
        Position positionOnPlateau = new Position(3,3);
        Position positionNotOnPlateau = new Position(6,7);

        assertTrue(positionOnPlateau.IsOnPlateau(plateau));
        assertFalse(positionNotOnPlateau.IsOnPlateau(plateau));

    }

    @Test
    public void moveForward() {
        Position position = new Position(3,3);
        Position expectedPosition = new Position(3,4);

        assertEquals(expectedPosition, position.moveForward(Compass.NORTH));

    }
}