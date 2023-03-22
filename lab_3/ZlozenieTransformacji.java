package lab_3;

public class ZlozenieTransformacji implements Transformacja{
    public Transformacja[] tab;
    public int length;

    public ZlozenieTransformacji(int n) {
        this.tab = new Transformacja[n];
        this.length = n;
    }

    public ZlozenieTransformacji(Transformacja[] tab) {
        this.tab = tab;
        this.length = tab.length;
    }

    @Override
    public ZlozenieTransformacji getTransformacjaOdwrotna() {
        Transformacja[] tab_copy = new Transformacja[length];
        for(int i = 0; i < length; i++) {
            try {
                tab_copy[i] = tab[length-i-1].getTransformacjaOdwrotna();
            } catch(BrakTransformacjiOdwrotnejException e) {
                e.printStackTrace();
            }
        }
        return new ZlozenieTransformacji(tab_copy);
    }
    
    @Override
    public Punkt transformuj(Punkt p) {
        for(int i =0; i< length; i++) {
            p = tab[i].transformuj(p);
        }
        return p;
    }
    
    public Transformacja[] getArr() {
        return tab;
    }
    @Override
    public String toString() {
        return "Tablica o " + length + " elementach";
    }
}
