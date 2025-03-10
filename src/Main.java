import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String fecha;
        String telefono;
        int opcion;
        int precio = 0;
        double total = 0;
        double iva;

        System.out.println("Bienvenido a la tienda Technology");

        System.out.print("Nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Fecha: ");
        fecha = scanner.nextLine();

        do {
            System.out.print("Teléfono (10 dígitos): ");
            telefono = scanner.nextLine();
        } while (!telefono.matches("\\d{10}"));

        do {
            System.out.println("\n¿Qué artículo quieres comprar?");
            System.out.println("1. Mouse - $80.000");
            System.out.println("2. Teclado - $320.000");
            System.out.println("3. Monitor - $910.000");
            System.out.println("4. Disco Duro - $230.000");
            System.out.println("5. RAM - $180.000");
            System.out.println("6. SALIR");
            System.out.print("Opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entre 1 y 6.");
                scanner.next();
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    precio = 80000;
                    System.out.println("Has seleccionado Mouse - Precio: $80.000");
                    break;
                case 2:
                    precio = 320000;
                    System.out.println("Has seleccionado Teclado - Precio: $320.000");
                    break;
                case 3:
                    precio = 910000;
                    System.out.println("Has seleccionado Monitor - Precio: $910.000");
                    break;
                case 4:
                    precio = 230000;
                    System.out.println("Has seleccionado Disco Duro - Precio: $230.000");
                    break;
                case 5:
                    precio = 180000;
                    System.out.println("Has seleccionado RAM - Precio: $180.000");
                    break;
                case 6:
                    System.out.println("GRACIAS POR TU COMPRA, VUELVE PRONTO.");

                    System.out.println("NOMBRE: "+ nombre);
                    System.out.println("FECHA: "+ fecha);
                    System.out.println("TELEFONO: "+ telefono);
                    break;
                default:
                    System.out.println("LA OPCION NO ES VALIDA, INTENTALO DE NUEVO.");
            }

            if (opcion >= 1 && opcion <= 5) {
                total += precio;
            }

        } while (opcion != 6);

        if (total > 0) {
            iva = total * 0.10;
            total += iva;
            System.out.println("\nSubtotal: $" + (int) (total - iva));
            System.out.println("IVA (10%): $" + (int) iva);
            System.out.println("Total a pagar con IVA: $" + (int) total);
        } else {
            System.out.println("\nNo realizaste ninguna compra.");
        }

        scanner.close();
    }
}























