package lab_3;

public class Uklad {
    public Punkt srodekUkladu;
    private static Uklad instance = null;
    public Translacja t1;
    public Translacja t2;

    private Uklad() {
        System.out.println("Stworzono uklad. ");
    }

    public static Uklad getInstance()
    {
        if (instance == null) {
            instance = new Uklad();
        }
        return instance;
    }

    public void setCenter(Punkt s) {
        srodekUkladu = s;
    }

    public void setT1(Translacja t1Copy) {
        t1 = t1Copy;
    }

    public void setT2(Translacja t2Copy) {
        t2 = t2Copy;
    }
}
