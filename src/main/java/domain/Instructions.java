package domain;

import java.util.ArrayList;

public class Instructions {

    public static final String SOMETHING_WRONG_WITH_THE_INSTRUCTIONS = "Something wrong with the instructions";
    private String instructions;

    public Instructions(String instructions) {
        this.instructions = instructions;
    }

    public Instruction[] getInstructions() throws Exception {
        ArrayList<Instruction> result = new ArrayList<Instruction>();

        for (char c: instructions.toCharArray()) {
            switch (c) {
                case 'L': result.add(Instruction.LEFT); break;
                case 'M': result.add(Instruction.MOVE); break;
                case 'R': result.add(Instruction.RIGHT); break;
                default: throw new Exception(SOMETHING_WRONG_WITH_THE_INSTRUCTIONS);
            }
        }

        return result.toArray(new Instruction[result.size()]);
    }
}
