package services;

import domain.InputData;
import domain.Plateau;
import domain.Rover;

import java.util.List;

public interface Explorer {

    List<Rover> exploreThePlateau(InputData inputData, Plateau plateau ) throws Exception;
}
