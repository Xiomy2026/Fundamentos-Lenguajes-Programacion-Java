import java.util.Random;

public class MatrizAleatoria {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[][] matriz = new int[5][5];

        // Llenar la matriz con números aleatorios del 1 al 9
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                matriz[fila][columna] = random.nextInt(9) + 1;
            }
        }

        // Mostrar la matriz
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(" "+ matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}