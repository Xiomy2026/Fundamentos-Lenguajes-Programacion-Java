import java.util.Random;

public class Histograma {
    public static void main(String[] args) {
        Random random = new Random();
        
        for(int n=1; n<=10; n++){
            int numero=random.nextInt(10)+1;
            System.out.print(n + ". " + numero + " ");
            
            for (int i = 1; i <= numero; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}