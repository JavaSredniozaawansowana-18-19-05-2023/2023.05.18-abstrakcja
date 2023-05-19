package pl.comarch.szkolenia.klasy.abstrakcyjne;

public class AlgorytmBaza extends Algorytm {
    @Override
    public void wczytaj() {
        System.out.println("Wczytaj z bazy !!!");
    }

    @Override
    public void zapiszWyniki() {
        System.out.println("Zapisuje do bazy !!!");
    }
}
