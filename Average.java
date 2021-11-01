import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.print("Podaj liczbę ocen: ");
        int licznik = czytnik.nextInt();

        //uutwórz tablicę o rozmiarze takim jak zadeklarowana liczba ocen
        double[] oceny = new double[licznik];
        for (int i=0; i<licznik; i++) {
            //wypełnij komórkę tablicy o indeksie i oceną wczytaną z wejścia
           oceny[i]= wczytajOcene(czytnik);
        }

        System.out.println("Liczba ocen: " + oceny.length);
        double suma = 0;
        for (int i=0; i<oceny.length; i++) {
            //powiększ aktualną sumę o wartość z kolejnej komórki tablicy
            suma += oceny[i];
        }
            
        //wypisz średnią arytmetyczną
        System.out.println("Średnia: " + suma/oceny.length);
        



    }

    private static double wczytajOcene(Scanner czytnik) {
        System.out.println("Podaj ocene: ");
        double ocena = czytnik.nextDouble();
        return ocena;
    }
    
}
