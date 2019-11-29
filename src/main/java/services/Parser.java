package services;

import domain.InputData;
import domain.Plateau;

public interface Parser {

    InputData parseFile(String path);
}
