package domain;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    int xTopRight;
    int yTopRight;
    private List<Rover> rovers = new ArrayList<Rover>();

    public Plateau(int xTopRight, int yTopRight) {
        this.xTopRight = xTopRight;
        this.yTopRight = yTopRight;
    }

    public void addRover(Rover rover) {
        rovers.add(rover);
    }

    public boolean isOccupied(Position position) {
        for (Rover rover : rovers) {
            if (rover.hasPosition(position)) {
                return true;
            }
        }

        return false;
    }
}

