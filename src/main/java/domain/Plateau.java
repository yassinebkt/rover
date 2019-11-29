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

    public int getxTopRight() {
        return xTopRight;
    }

    public void setxTopRight(int xTopRight) {
        this.xTopRight = xTopRight;
    }

    public int getyTopRight() {
        return yTopRight;
    }

    public void setyTopRight(int yTopRight) {
        this.yTopRight = yTopRight;
    }

    public List<Rover> getRovers() {
        return rovers;
    }

    public void setRovers(List<Rover> rovers) {
        this.rovers = rovers;
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
/*

class test {

    int xTopRight;
    int yTopRight;
    List<Coordinates> coordinates;


    public int getxTopRight() {
        return xTopRight;
    }

    public void setxTopRight(int xTopRight) {
        this.xTopRight = xTopRight;
    }

    public int getyTopRight() {
        return yTopRight;
    }

    public void setyTopRight(int yTopRight) {
        this.yTopRight = yTopRight;
    }

    public List<Coordinates> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinates> coordinates) {
        this.coordinates = coordinates;
    }
}
*/


