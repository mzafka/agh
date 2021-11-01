import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.print("Podaj liczbę ocen: ");
        int licznik = czytnik.nextInt();
        double suma = 0;
        for (int i=0; i<licznik; i++) {
           suma += wczytajOcene(czytnik);
        }

        System.out.println(suma/licznik);
    }

    private static double wczytajOcene(Scanner czytnik) {
        System.out.println("Podaj ocene: ");
        double ocena = czytnik.nextDouble();
        return ocena;
    }
    
}
