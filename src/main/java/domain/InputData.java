package domain;

import java.util.List;

public class InputData {
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
