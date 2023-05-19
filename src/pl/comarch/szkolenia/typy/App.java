package pl.comarch.szkolenia.typy;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double wynik = ((double) a)/b;
        System.out.println(wynik);

        double x = 5.0;
        int y = (int) x;

        if(true) {
            int z = 10;
        }

        int z = 10;

        Client client = new Client();
        Client client2 = client;
        cos(client);

        System.out.println(client);

        System.gc();
    }

    public static void metoda() {
        int x = 5;
    }

    public static void cos(Client c) {
        //???
    }
}
