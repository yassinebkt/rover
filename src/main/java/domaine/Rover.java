package domaine;

public class Rover {


    public static final Character L = 'L';
    public static final Character R = 'R';
    public static final Character M = 'M';

    private Integer x = 0;
    private Integer y = 0;
    private Integer facing = Compass.N.decimaleValue();

    public Rover() {
    }

    public void setPosition(Integer x, Integer y, Integer facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public void printPosition() {
        char dir =  Compass.N.toString().charAt(0);
        if (facing == 1) {
            dir = Compass.N.toString().charAt(0);
        } else if (facing == 2) {
            dir = Compass.E.toString().charAt(0);
        } else if (facing == 3) {
            dir = Compass.S.toString().charAt(0);
        } else if (facing == 4) {
            dir = Compass.W.toString().charAt(0);
        }
        System.out.println(x +  " " +  y +  " " +  dir);
    }

    public void process(String commands) {
        for (int idx = 0; idx < commands.length(); idx++ ) {
            process(commands.charAt(idx));
        }
    }
    private void process(Character command) {
        if (L.equals(command)) {
            turnLeft();
        } else if (R.equals(command)) {
            turnRight();
        } else if (M.equals(command)) {
            move();
        } else {
            throw new IllegalArgumentException(
                    "Speak in Mars language, please!");
        }
    }

    private void move() {
        if (facing == Compass.N.decimaleValue()) {
            this.y++  ;
        } else if (facing == Compass.E.decimaleValue()) {
            this.x++  ;
        } else if (facing == Compass.S.decimaleValue()) {
            this.y--;
        } else if (facing == Compass.W.decimaleValue()) {
            this.x--;
        }
    }
    private void turnLeft() {
        facing = (facing - 1) < Compass.N.decimaleValue() ? Compass.W.decimaleValue() : facing - 1;
    }
    private void turnRight() {
        facing = (facing  + 1) > Compass.W.decimaleValue() ? Compass.N.decimaleValue() : facing  + 1;
    }

}
