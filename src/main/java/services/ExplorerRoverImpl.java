package services;

import domain.*;

public class ExplorerRoverImpl implements Explorer {
    @Override
    public void exploreThePlateau(InputData inputData, Plateau plateau) throws Exception {

        for (Coordinates coor: inputData.getCoordinates()) {
            Rover rover = new Rover();
            rover.dropRover(plateau, coor.getX(),coor.getY(),coor.getDirection());
            Instruction[] instructionsCollection = new Instructions(coor.getInstruction()).getInstructions();
            rover.processInstructions(instructionsCollection);
            System.out.println(rover.reportPosition());
        }
    }

}
