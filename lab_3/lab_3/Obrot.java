package lab_3;

public class Obrot implements Transformacja {
    private final double alfa;

    public Obrot(double alfa) {
        this.alfa = alfa*3.14;
    }
    
    @Override
    public Obrot getTransformacjaOdwrotna() {
        return new Obrot(-alfa);
    }
    
    @Override
    public Punkt transformuj(Punkt p) throws BrakUkladuExc  {
        Uklad uklad =Uklad.getInstance();
        if(uklad.srodekUkladu == null) throw new BrakUkladuExc("Brak ukladu");

        p = uklad.t1.transformuj(p);
        p = new Punkt(p.GetX() * Math.cos(alfa) - p.GetY() * Math.sin(alfa), p.GetX() * Math.sin(alfa) + p.GetY()*Math.cos(alfa));
        p = uklad.t2.transformuj(p);
        return p;
    }
    public double getAlfa() {
        return alfa;
    }
    @Override
    public String toString() {
        return "Obrot o kat " + alfa;
    }
}
