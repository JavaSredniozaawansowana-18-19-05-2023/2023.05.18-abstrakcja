package pl.comarch.szkolenia.abstrakcja;

public class ImplementacjaInterfejsu implements SimpleInterface {
    @Override
    public void method1() {
        System.out.println("Metoda 1");
    }

    @Override
    public void zapisz(int i) {
        System.out.println("Zapisuje !!");
    }

    @Override
    public int odczytaj() {
        System.out.println("Odczytuje !!");
        return 0;
    }

    @Override
    public void zaktualizuj(int i) {
        System.out.println("aktualizuje !!");
    }
}
