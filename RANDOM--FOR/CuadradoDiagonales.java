public class CuadradoDiagonales {
    public static void main(String[] args) {
        int n = 5; // tamaño 5x5

        for (int f = 1; f <= n; f++) {
            for (int c = 1; c <= n; c++) {
                
                // Diagonal principal: f == c
                // Diagonal secundaria: f + c == n + 1
                if (f == c || f + c == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}