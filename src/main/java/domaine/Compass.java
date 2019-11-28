package domaine;

public enum Compass {

    N(1),
    E(2),
    S(3),
    W(4),
    ;

    private Integer value;

    Compass(Integer value) {
        this.value = value;
    }

    public char charValue(){
        return (char) ('0' + value);
    }

    public int decimaleValue() {
        return value;
    }

    public String motif() {
        return name();
    }



}
