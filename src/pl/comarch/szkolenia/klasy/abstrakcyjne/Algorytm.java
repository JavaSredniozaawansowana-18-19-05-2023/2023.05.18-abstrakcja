package pl.comarch.szkolenia.klasy.abstrakcyjne;

public abstract class Algorytm {

    public void calculate() {
        wczytaj();
        k1();
        k2();
        k3();
        zapiszWyniki();
    }

    public abstract void wczytaj();

    private void k1() {
        System.out.println("Pierweszy krok liczenia !!!");
    }

    private void k2() {
        System.out.println("Drugi krok liczenia !!!");
    }

    private void k3() {
        System.out.println("Trzeci krok liczenia !!!");
    }

    public abstract void zapiszWyniki();
}
