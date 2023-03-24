package lab_3;

public interface Transformacja {
    Punkt transformuj(Punkt p) throws BrakUkladuExc;
    Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException;
}
