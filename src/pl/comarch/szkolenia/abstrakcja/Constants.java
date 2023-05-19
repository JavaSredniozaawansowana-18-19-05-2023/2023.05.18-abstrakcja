package pl.comarch.szkolenia.abstrakcja;

public interface Constants {
    double PI = 3.14;
    int STALA = 15;

    void a();

    default void metoda() {
        k1();
        k2();
        k3();
    }

    private void k1() {

    }

    private void k2() {

    }

    private void k3() {

    }
}
