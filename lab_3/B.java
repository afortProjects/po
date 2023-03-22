package lab_3;

public class B {
    private int liczba;

    public B(int liczba) {
        this.liczba = liczba;
    }

    public void SetLiczba(int liczba) {
        this.liczba = liczba;
    }

    public int GetLiczba() {
        return this.liczba;
    }
    
    @Override
    public String toString() {
        return "Instancja klasy A zawierająca liczbę " + liczba;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof B) {
            B other = (B)obj;
            return liczba == other.liczba;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 10*Double.hashCode(liczba)+7;
    }
}
