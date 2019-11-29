package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InstructionsTest {

    @Test
    public void getInstructions() throws Exception {
        Instructions instruction = new Instructions("LMRL");
        ArrayList<Instruction> result = new ArrayList<Instruction>();
        result.add(Instruction.LEFT);
        result.add(Instruction.MOVE);
        result.add(Instruction.RIGHT);
        result.add(Instruction.LEFT);
        Instruction[] expectedResult = result.toArray(new Instruction[result.size()]);
        assertThat(expectedResult, is(instruction.getInstructions()));

    }
}