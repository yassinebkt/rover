package services;

import domain.InputData;
import domain.Plateau;

public interface Explorer {

    void exploreThePlateau(InputData inputData, Plateau plateau ) throws Exception;
}
