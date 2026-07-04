import java.util.Random;

public class LanzarDado {
    public static void main(String[] args) {
        Random random = new Random();
        
        for(int n=1; n<=10; n++){
            int numero=random.nextInt(6)+1;
            System.out.println(n +". Mostrar Lanzamiento: " + numero);
        }
    }
}