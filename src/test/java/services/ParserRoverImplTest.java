package services;

import domain.Coordinates;
import domain.InputData;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ParserRoverImplTest {

    @Test
    public void parseFile() {
        // Parse the date from a file
        Parser parser = new ParserRoverImpl();
       // ClassLoader classloader = Thread.currentThread().getContextClassLoader();
       // InputStream is = classloader.getResourceAsStream("test.csv");

        //String path = getClass().getResource("input.txt").getPath();
        File file = new File("resources/input.txt");
        String absolutePath = file.getAbsolutePath();

        InputData inputData = parser.parseFile(absolutePath);
        InputData expectedData = new InputData();
        List<Coordinates> coordinates = new ArrayList<>();
        coordinates.add(new Coordinates(1,2,'N', "LMLMLMLMM"));
        coordinates.add(new Coordinates(3,3,'E', "MMRMMRMRRM"));
        expectedData.setCoordinates(coordinates);
        expectedData.setxTopRight(5);
        expectedData.setyTopRight(5);



        assertEquals(expectedData.getxTopRight(), inputData.getxTopRight());
        assertEquals(expectedData.getyTopRight(), inputData.getyTopRight());
        assertThat(expectedData.getCoordinates(), is(inputData.getCoordinates()));
    }
}