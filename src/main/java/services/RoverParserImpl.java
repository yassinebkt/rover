package services;

import domaine.Coordinates;
import domaine.DataParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoverParserImpl implements Parser {

    @Override
    public DataParser parseFile(String path) {
        DataParser dataParser = new DataParser();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            int i = 0 ;
            Coordinates coor = new Coordinates();
            List<Coordinates> inputCoordinates = new ArrayList<>();



            while (line != null) {
                if(i == 0){
                    String[] parts = line.split(" ");
                    dataParser.setxTopRight(Integer.parseInt(parts[0]));
                    dataParser.setyTopRight(Integer.parseInt(parts[1]));

                } else if (i%2 != 0){
                    String[] parts = line.split(" ");
                    if(parts.length == 3){
                        coor = new Coordinates( Integer.parseInt(parts[0]),Integer.parseInt(parts[1]), parts[2].charAt(0),null);
                    }
                } else if (i%2 == 0){
                    coor.setInstructions(line);
                    inputCoordinates.add(coor);
                }
                System.out.println(line);
                line = br.readLine();
                i++;
            }
            dataParser.setCoordinates(inputCoordinates);
        } catch (IOException e) {
            throw new IllegalArgumentException("Input file name must not be empty");
        }

        return dataParser;
    }
}
