package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class CmentarzZIWojny extends Atrakcja {
    private String nazwa;
    public CmentarzZIWojny(String nowaNazwa) {
        super(0.3);
        nazwa = nowaNazwa;
    }

    public String getNazwaCmentarza() {
        return nazwa;
    }

    @Override
    public String getNazwa() {
        return "Cmenatrz Z I Wojny w " + nazwa;
    }

}
