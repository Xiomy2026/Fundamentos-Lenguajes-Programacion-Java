import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo = 1000;
        int opcion = 0;
        
        System.out.println("   \"BIENVENIDO AL CAJERO BCP\"");

        
        while (opcion != 4) {

            System.out.println("MENÚ PRINCIPAL");
            System.out.println(" 1. Consultar saldo");
            System.out.println(" 2. Depositar");
            System.out.println(" 3. Retirar");
            System.out.println(" 4. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Su saldo actual es: S/ " + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: S/ ");
                    double deposito = entrada.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado con éxito.");
                    System.out.println("Nuevo saldo: S/ " + saldo);
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: S/ ");
                    double retiro = entrada.nextDouble();

                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro realizado con éxito.");
                        System.out.println("Nuevo saldo: S/ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 4:
                    System.out.println("\"Gracias por utilizar el Cajero BCP\"");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        entrada.close();
    }
}
