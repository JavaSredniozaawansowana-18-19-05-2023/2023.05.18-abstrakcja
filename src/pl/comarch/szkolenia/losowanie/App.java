package pl.comarch.szkolenia.losowanie;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int losowaLiczba = random.nextInt(36);
        System.out.println(losowaLiczba);
    }
}
