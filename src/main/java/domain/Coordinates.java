package domain;

import java.util.Objects;

public class Coordinates {

    private  Integer x;
    private  Integer y;
    private  Character direction;
    private  String instruction;

    public Coordinates() {
        // Pour initialiser les coordonner avant du passage du parseur
    }

    public Coordinates(Integer x, Integer y, Character direction, String instructions) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.instruction = instructions;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Character getDirection() {
        return direction;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y) &&
                Objects.equals(direction, that.direction) &&
                Objects.equals(instruction, that.instruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction, instruction);
    }
}
