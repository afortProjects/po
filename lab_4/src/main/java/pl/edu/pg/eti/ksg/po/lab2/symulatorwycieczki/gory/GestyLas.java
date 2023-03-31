package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class GestyLas extends Wedrowka {
    
    public GestyLas(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        //Brak modyfikacji
        predkosc *= 0.5;
        return predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 5;
    }    

    @Override
    public String getNazwa() {
        return "Gesty Las";
    }
    
}
