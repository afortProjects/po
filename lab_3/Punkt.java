package lab_3;

public class Punkt {
    private final double x,y;
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double GetX() {
        return this.x;
    }

    public double GetY() {
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Punkt) {
            Punkt otherPunkt = (Punkt)obj;
            return (otherPunkt.x == this.x && otherPunkt.y == this.y);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 10*Double.hashCode(x)*Double.hashCode(y);

    }
    @Override
    public String toString() {
        return "Punkt (" + x + ", " + y +  ")";
    }

    public static final Punkt O = new Punkt(0,0);
    public static final Punkt E_X = new Punkt(1,0);
    public static final Punkt E_Y = new Punkt(0,1);
}

