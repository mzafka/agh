import java.util.Scanner;

public class Dzielnik {
    public static void main(String[] args) {
        int liczba = wczytajLiczbe();
        System.out.println("Wczytano " + liczba);

        znajdzDzielnik(liczba);
    }

    private static int wczytajLiczbe() {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        return czytnik.nextInt();
    }

    private static void znajdzDzielnik(int liczba) {
        if (liczba == 0 || liczba == 1) {
            System.out.println("Dzielnik: " + liczba);
        } else {
            System.out.println("Dzielnik: " + liczba);
            System.out.println("Dzielnik: " + 1);

            System.out.println("Sprawdź inne dzielniki");
            for (int i=2; i <= liczba/2; i++){
                if (liczba % i == 0) {
                    System.out.println("Dzielnik: " + i);
                }


            }
        }
    }
}
