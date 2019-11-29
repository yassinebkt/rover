package services;

import domain.Coordinates;
import domain.InputData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserRoverImpl implements Parser {

    @Override
    public InputData parseFile(String path) {
        InputData inputData = new InputData();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            int i = 0 ;
            Coordinates coor = new Coordinates();
            List<Coordinates> inputCoordinates = new ArrayList<>();



            while (line != null) {
                if(i == 0){ // methode pour chaque if pour savoir quesque ca fait
                    String[] parts = line.split(" ");
                    inputData.setxTopRight(Integer.parseInt(parts[0]));
                    inputData.setyTopRight(Integer.parseInt(parts[1]));

                } else if (i%2 != 0){ // methode pour chaque if pour savoir quesque ca fait
                    String[] parts = line.split(" ");
                    if(parts.length == 3){
                        coor = new Coordinates( Integer.parseInt(parts[0]),Integer.parseInt(parts[1]), parts[2].charAt(0),null);
                    }
                } else if (i%2 == 0){ // methode pour chaque if pour savoir quesque ca fait
                    coor.setInstruction(line);
                    inputCoordinates.add(coor);
                }
                System.out.println(line);
                line = br.readLine();
                i++;
            }
            inputData.setCoordinates(inputCoordinates);
        } catch (IOException e) {
            throw new IllegalArgumentException("Input file name must not be empty");
        }

        return inputData;
    }
}
