import java.util.Random;
public class ParImpar {
    public static void main(String[] args) {
        Random random = new Random();
        
        int par=0;
        int impar=0;
        
        for(int n=1; n<=20; n++){
            int numero = random.nextInt(50) + 1;
            
            if(numero %2==0) {
                par++;
            }else{
                impar++;
            }
            System.out.println(n + ". Numero:\t " + numero);
        }
        System.out.println("Cantidad de pares: " + par);
        System.out.println("Cantidad de impares: "+ impar);
    }
}

