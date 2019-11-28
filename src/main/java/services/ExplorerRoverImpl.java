package services;

import domaine.Compass;
import domaine.Coordinates;
import domaine.DataParser;
import domaine.Rover;

public class ExplorerRoverImpl implements Explorer {
    @Override
    public void exploreThePlateau(DataParser inputData) {
        Rover rover = new Rover();
        for (Coordinates coor: inputData.getCoordinates()) {
            Compass com = Compass.valueOf(coor.getDirection().toString());
            rover.setPosition(coor.getX(), coor.getY(),com.decimaleValue() );
            rover.process(coor.getInstructions());
            rover.printPosition();
        }
    }
}
