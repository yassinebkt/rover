package services;

import domain.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExplorerRoverImplTest {

    @Test
    public void exploreThePlateau() throws Exception {

        Explorer explorer = new ExplorerRoverImpl();
        // Create the plateau
        Plateau plateau = new Plateau(5,5);
        List<Rover> listRover = new ArrayList<>();

        Rover expectedRover= new Rover();
        expectedRover.setPosition(new Position(1,3));
        expectedRover.setCompass(Compass.NORTH);
        
        InputData inputData = new InputData();
        List<Coordinates> coordinates = new ArrayList<>();
        coordinates.add(new Coordinates(1,2,'N', "LMLMLMLMM"));
        inputData.setCoordinates(coordinates);


        listRover = explorer.exploreThePlateau(inputData,plateau);
        Rover rover= new Rover();
        if(listRover != null){
            rover = listRover.get(0);
        }
        assertEquals(expectedRover,rover);


    }
}