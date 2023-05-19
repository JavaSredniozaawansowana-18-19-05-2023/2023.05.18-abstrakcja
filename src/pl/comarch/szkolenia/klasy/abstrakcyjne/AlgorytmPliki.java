package pl.comarch.szkolenia.klasy.abstrakcyjne;

public class AlgorytmPliki extends Algorytm {
    @Override
    public void wczytaj() {
        System.out.println("Wczytuje z pliku !!!");
    }

    @Override
    public void zapiszWyniki() {
        System.out.println("Zapisuje do pliku !!!");
    }
}
