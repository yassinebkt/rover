package domain;

import java.util.Objects;

public class Position {

    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position other) {
        this.x = other.x;
        this.y = other.y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(x, position.x) &&
                Objects.equals(y, position.y);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    public boolean IsOnPlateau(Plateau p) {
        if (x < 0 || x > p.xTopRight) {
            return false;
        }

        if (y < 0 || y > p.yTopRight) {
            return false;
        }

        return true;
    }

    public Position moveForward(Compass compass) {
        Position newPosition = null;

        switch (compass) {
            case EAST: newPosition = new Position(x + 1, y); break;
            case NORTH: newPosition = new Position(x, y + 1); break;
            case SOUTH: newPosition = new Position(x, y - 1); break;
            case WEST: newPosition = new Position(x - 1, y); break;
        }

        return newPosition;
    }
}
