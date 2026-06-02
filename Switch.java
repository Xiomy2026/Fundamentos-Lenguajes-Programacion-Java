import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una opción (1, 2, 3): ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 1");
                break;
            case 2:
                System.out.println("Has seleccionado la opción 2");
                break;
            case 3:
                System.out.println("Has seleccionado la opción 3");
                break;
            default:
                System.out.println("Opción no válida");
        }

        entrada.close();
    }
}