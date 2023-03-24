package lab_3;

public class Skalowanie implements Transformacja {
    private final double skalaX, skalaY;

    public Skalowanie(double skalaX, double skalaY) {
        this.skalaX = skalaX;
        this.skalaY = skalaY;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        if(skalaX == 0 || skalaY == 0) throw new BrakTransformacjiOdwrotnejException("Brak transformacji odwrotnej");
        return new Skalowanie(1/skalaX, 1/skalaY);
    }

    @Override
    public Punkt transformuj(Punkt p) throws BrakUkladuExc {
        Uklad uklad = Uklad.getInstance();
        if(uklad.srodekUkladu == null)
            throw new BrakUkladuExc("Brak ukladu");
        p = uklad.t1.transformuj(p);
        p = new Punkt(skalaX * p.GetX(), skalaY * p.GetY());
        p = uklad.t2.transformuj(p);
        return p;
        
    }
    public double getSkalaX() {
        return skalaX;
    }
    public double getSkalaY() {
        return skalaY;
    }
    @Override
    public String toString() {
        return "Skalowanie "+skalaX+"x oraz "+skalaY+"y";
    }
 
}
