import java.util.Scanner;

public class Dzielnik {
    public static void main(String[] args) {
        int liczba = wczytajLiczbe();
        System.out.println("Wczytano " + liczba);

        int[] dzielniki = znajdzDzielnik(liczba);

        drukuj(dzielniki);
    }

    private static int wczytajLiczbe() {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        return czytnik.nextInt();
    }

    private static int[] znajdzDzielnik(int liczba) {
        int[] dzielniki = {liczba};

        if (liczba > 1) {
            dzielniki = new int[2];
            dzielniki[0] = liczba;
            dzielniki[1] = 1;
            
            for (int i=2; i <= liczba/2; i++){
                if (liczba % i == 0) {
                    int[] noweDzielniki = new int[dzielniki.length + 1];
                    
                    System.arraycopy(dzielniki, 0, noweDzielniki, 0, dzielniki.length);
                    noweDzielniki[noweDzielniki.length - 1] = i;
                    dzielniki = noweDzielniki;
                }
            }

        }

        return dzielniki;
    }

    private static void drukuj(int[] dzielniki) {
        System.out.println("Liczba dzielników " + dzielniki.length);
        for (int i=0; i<dzielniki.length; i++){
            System.out.println(dzielniki[i]);
        }
    }
}
