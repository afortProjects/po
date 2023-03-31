package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class DrewnianaCerkiew extends Atrakcja {
    private String nazwa;
    public DrewnianaCerkiew(String nowaNazwa) {
        super(0.5);
        nazwa = nowaNazwa;
    }

    public String getNazwaCerkwii() {
        return nazwa;
    }

    @Override
    public String getNazwa() {
        return "Drewniana cerkiew w " + nazwa;
    }

    
}
