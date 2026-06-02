import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("MENÚ DE OPCIONES");
        System.out.println("1. Registrar");
        System.out.println("2. Buscar");
        System.out.println("3. Eliminar");
        System.out.println("4. Salir");

        System.out.print("Seleccione una opción: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Usted está en Registrar");
                break;

            case 2:
                System.out.println("Usted está en Buscar");
                break;

            case 3:
                System.out.println("Usted está en Eliminar");
                break;

            case 4:
                System.out.println("Usted está en Salir");
                break;

            default:
                System.out.println("Opción no válida");
        }

        entrada.close();
    }
}