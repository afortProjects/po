package lab_3;

public class Obrot implements Transformacja {
    private final int alfa;

    public Obrot(int alfa) {
        this.alfa = alfa;
    }
    
    @Override
    public Obrot getTransformacjaOdwrotna() {
        return new Obrot(-alfa);
    }
    
    @Override
    public Punkt transformuj(Punkt p) {
        return new Punkt(p.GetX() * Math.cos(alfa) - p.GetY() * Math.sin(alfa), p.GetX() * Math.sin(alfa) + p.GetY()*Math.cos(alfa));
    }
    public double getAlfa() {
        return alfa;
    }
    @Override
    public String toString() {
        return "Obrot o kat " + alfa;
    }
}
