import domain.*;
import services.Explorer;
import services.ExplorerRoverImpl;
import services.Parser;
import services.ParserRoverImpl;


public class Main {

    public static void main(String[] args) throws Exception {



        // Parse the date from a file
        Parser parser = new ParserRoverImpl();
        InputData inputData = parser.parseFile(args[0]);

        // Create the plateauxt
        Plateau plateau = new Plateau(inputData.getxTopRight(),inputData.getyTopRight());


        // Use the date to change the rover's position
        Explorer explorer = new ExplorerRoverImpl();
        explorer.exploreThePlateau(inputData,plateau);



    }


}
