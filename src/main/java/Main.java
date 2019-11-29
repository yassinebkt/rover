import domain.*;
import services.Explorer;
import services.ExplorerRoverImpl;
import services.Parser;
import services.ParserRoverImpl;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {



        // Parse the date from a file
        Parser parser = new ParserRoverImpl();
        InputData inputData = parser.parseFile(args[0]);

        // Create the plateauxt
        Plateau plateau = new Plateau(inputData.getxTopRight(),inputData.getyTopRight());


        // Use the date to change the rover's position
        List<Rover> listRover;
        Explorer explorer = new ExplorerRoverImpl();
        listRover = explorer.exploreThePlateau(inputData,plateau);

        for (Rover rover: listRover ) {
            System.out.println(rover.reportPosition());
        }



    }


}
