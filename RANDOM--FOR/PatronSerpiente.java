public class PatronSerpiente {

    public static void main(String[] args) {

        int filas = 4;
        int columnas = 5;
        int numero = 1;

        for (int i = 0; i < filas; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < columnas; j++) {
                    System.out.printf("%3d", numero);
                    numero++;
                }

            } else {

                int inicio = numero + columnas - 1;

                for (int j = inicio; j >= numero; j--) {
                    System.out.printf("%3d", j);
                }

                numero += columnas;
            }

            System.out.println();
        }
    }
}