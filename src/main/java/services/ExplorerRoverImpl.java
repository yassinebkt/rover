package services;

import domain.*;

import java.util.ArrayList;
import java.util.List;

public class ExplorerRoverImpl implements Explorer {
    @Override
    public List<Rover> exploreThePlateau(InputData inputData, Plateau plateau) throws Exception {
        List<Rover> listRover = new ArrayList<>();
        for (Coordinates coor: inputData.getCoordinates()) {
            Rover rover = new Rover();
            rover.dropRover(plateau, coor.getX(),coor.getY(),coor.getDirection());
            Instruction[] instructionsCollection = new Instructions(coor.getInstruction()).getInstructions();
            rover.processInstructions(instructionsCollection);
            listRover.add(rover);
        }
        return listRover;
    }

}
