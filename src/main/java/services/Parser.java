package services;

import domaine.DataParser;

public interface Parser {

    DataParser parseFile(String path);
}
