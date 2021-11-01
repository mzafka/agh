public class Triangle {
    public static void main(String[] args) {
        double a = 5;
        double h = 3;

        double triangle = (int)a*(int)h/2;

        if (triangle>7) {
            System.out.println("Duzy trojkat");
        }
        else {
            System.out.println("Maly trojkat");
        }
    }
}
