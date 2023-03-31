package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wycieczka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.CmentarzZIWojny;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;

public class PrzewodnikBeskidzki extends PrzewodnikStudencki {
    public PrzewodnikBeskidzki(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 5.0, 16 , 18);
    }

    @Override
    public void opiszWycieczke(Wycieczka wycieczka) {
        mow("Szanowna grupo, proszę o uwagę. Teraz opowiem Wam o wycieczce.");
        super.opiszWycieczke(wycieczka);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

   @Override
   public void reagujNaAtrakcje(Atrakcja a, double czas) {
       if(a instanceof DrewnianaCerkiew) {
           DrewnianaCerkiew cerkiewka = (DrewnianaCerkiew) a;
           mow("To jest drewniana cerkiew w miejcowości " + cerkiewka.getNazwaCerkwii() + ". Wiele taki można spotkać w Beskidach. Po mojej lewej widać wieżę o kontrukcji słupowo ramowej ...");
           regeneruj(czas);
       }
       else if(a instanceof CmentarzZIWojny) {
           CmentarzZIWojny cmentarz = (CmentarzZIWojny) a;
           mow("Tutaj widzimy cmentarz z I Wojny Światowej w miejcowości "+cmentarz.getNazwaCmentarza()+". Takie cmentarze projektował m.in. Dušan Jurkovič.");
           regeneruj(czas);
       }
       else {
           super.reagujNaAtrakcje(a, czas);
       }
   }
    
    
}
