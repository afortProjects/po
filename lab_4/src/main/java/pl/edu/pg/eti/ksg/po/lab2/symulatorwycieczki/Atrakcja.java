package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

import javax.lang.model.element.Element;

public abstract class Atrakcja implements ElementWycieczki {
    private double czasWycieczkiWGodzinach;

    public Atrakcja(double nowyCzasWycieczkiWGodzinach) {
        czasWycieczkiWGodzinach = nowyCzasWycieczkiWGodzinach;
    }
    
    public double getCzas() {
        return czasWycieczkiWGodzinach;
    }
}
