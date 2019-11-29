package domain;

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
}
