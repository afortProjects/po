package lab_3;
import java.util.Scanner;

public class A {
    private int liczba;

    public A(int liczba) {
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

}