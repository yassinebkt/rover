package domaine;

public class Coordinates {

    private  Integer x;
    private  Integer y;
    private  Character direction;
    private  String instructions;

    public Coordinates() {
        // Pour initialiser les coordonner avant du passage du parseur
    }

    public Coordinates(Integer x, Integer y, Character direction, String instructions) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.instructions = instructions;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Character getDirection() {
        return direction;
    }

    public void setDirection(Character direction) {
        this.direction = direction;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
