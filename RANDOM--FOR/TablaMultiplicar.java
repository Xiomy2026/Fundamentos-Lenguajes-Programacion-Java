public class TablaMultiplicar {
    public static void main(String[] args) {
        for (int fila = 1; fila <= 5; fila++) {
            for (int columna = 1; columna <= 5; columna++) {
                System.out.printf("%4d", fila * columna);
            }
            System.out.println();
        }
    }
}