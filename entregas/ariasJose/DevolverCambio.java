import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int eurosPorPagar = scanner.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int eurosPago = scanner.nextInt();

        System.out.println(eurosPorPagar + " " + eurosPago);

        scanner.close();
    }
}
