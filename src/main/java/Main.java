import domaine.DataParser;
import services.Explorer;
import services.ExplorerRoverImpl;
import services.Parser;
import services.RoverParserImpl;


public class Main {

    public static void main(String[] args)  {

        // Parse the date from a file
        Parser parser = new RoverParserImpl();
        DataParser inputData =  parser.parseFile(args[0]);

        // Use the date to change the rover's position
        Explorer explorer = new ExplorerRoverImpl();
        explorer.exploreThePlateau(inputData);

    }

}
