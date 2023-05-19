package pl.comarch.szkolenia.abstrakcja;

public class App {
    public static void main(String[] args) {
        SimpleInterface klasaKolegi = new ImplementacjaInterfejsu();
        klasaKolegi.method1();
        int x = klasaKolegi.odczytaj();
        klasaKolegi.zapisz(17);
        klasaKolegi.zaktualizuj(20);


        /*SimpleInterface obiekt = new SimpleInterface();
        obiekt.method1();*/

        K.a = 15;

        ///
        //

        K.a = 30;

        Cos.wypisz();


        System.out.println(Constants.PI);
        //Constants.PI = 3.15;
    }
}
