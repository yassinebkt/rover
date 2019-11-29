package domain;



public class Rover {

    private Plateau plateau;
    private Position position;
    private Compass compass;

    public Rover() {
    }

    public boolean hasPosition(Position pos) {
        return position.isEqual(pos);
    }

    public String reportPosition() {
        if (position == null || compass == null) {
            return "Not dropped yet.";
        }

        return position.toString() + " " + FromCompass(compass);
    }

    public void processInstructions(Instruction[] instructions) throws Exception {
        for (Instruction i : instructions) {
            processInstruction(i);
        }
    }

    private void processInstruction(Instruction instruction) throws Exception {
        if (position == null || compass == null) {
            throw new Exception("Not droped yes");
        }

        switch (instruction) {
            case LEFT: turnLeft(); break;
            case MOVE: moveForward(); break;
            case RIGHT: turnRight(); break;
        }
    }

    private void turnLeft() {
        switch (compass) {
            case EAST: compass = Compass.NORTH; break;
            case NORTH: compass = Compass.WEST; break;
            case SOUTH: compass = Compass.EAST; break;
            case WEST: compass = Compass.SOUTH; break;
        }
    }

    private void turnRight() {
        switch (compass) {
            case EAST: compass = Compass.SOUTH; break;
            case NORTH: compass = Compass.EAST; break;
            case SOUTH: compass = Compass.WEST; break;
            case WEST: compass = Compass.NORTH; break;
        }
    }

    private void moveForward() {
        Position newPosition = position.moveForward(compass);

        if (!newPosition.IsOnPlateau(plateau)) {
            throw new PositionNotOnPlateauException(plateau, newPosition);
        }

        position = newPosition;
    }

    private static Compass ToCompass(char compass) {
        switch (compass) {
            case 'N': return Compass.NORTH;
            case 'W': return Compass.WEST;
            case 'S': return Compass.SOUTH;
            case 'E': return Compass.EAST;
            default: throw new RuntimeException("Unsupported character '" + compass + "'!");
        }
    }

    private static char FromCompass(Compass compass) {
        switch (compass) {
            case NORTH: return 'N';
            case WEST: return 'W';
            case SOUTH: return 'S';
            case EAST: return 'E';
            default: return ' ';
        }
    }

    public void dropRover(Plateau plateau, int x, int y, Compass comp) {
        dropRover(plateau, new Position(x, y), comp);
    }

    public void dropRover(Plateau plateau, Position p, Compass comp) {
        if (!p.IsOnPlateau(plateau)) {
            throw new PositionNotOnPlateauException(plateau, p);
        }

        if (plateau.isOccupied(p)) {
            throw new RuntimeException("Already occupied by a rover!");
        }

        this.plateau = plateau;
        position = p;
        compass = comp;

        plateau.addRover(this);
    }

    public void dropRover(Plateau plateau, int posX, int posY, char compass) {
        Compass comp = ToCompass(compass);

        dropRover(plateau, new Position(posX, posY), comp);
    }
}

