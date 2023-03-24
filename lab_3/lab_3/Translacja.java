package lab_3;

public class Translacja implements Transformacja{
    private final double dX, dY;

    public Translacja(double dX, double dY) {
        this.dX = dX;
        this.dY = dY;
    }
    @Override
    public Transformacja getTransformacjaOdwrotna() {
        return new Translacja(-dX, -dY);
    }
    @Override
    public Punkt transformuj(Punkt p) {
        return new Punkt(p.GetX() + dX, p.GetY() + dY);
    }
    public double getdX() {
        return dX;
    }
        public double getdY() {
        return dY;
    }
    @Override
    public String toString() {
        return "Translacja o wektor ("+dX+","+dY+")";
    }
       
}
