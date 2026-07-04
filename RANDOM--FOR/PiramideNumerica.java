public class PiramideNumerica {
    public static void main(String[] args) {

        for (int fila = 1; fila <= 5; fila++) {

            // Imprimir espacios
            for (int espacio = 5; espacio > fila; espacio--) {
                System.out.print(" ");
            }

            // Números ascendentes
            for (int i = 1; i <= fila; i++) {
                System.out.print(i);
            }

            // Números descendentes
            for (int i = fila - 1; i >= 1; i--) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}