package pl.comarch.szkolenia.klasy.abstrakcyjne;

public class App {
    public static void main(String[] args) {
        /*KlasaAbstrakcyjna klasaAbstrakcyjna = new Child(6);
        klasaAbstrakcyjna.x();*/

        Algorytm algorytm = new AlgorytmPliki();
        algorytm.calculate();


        Algorytm algorytm2 = new AlgorytmBaza();
        algorytm2.calculate();
    }
}
