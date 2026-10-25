import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int eurosPorPagar = scanner.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int eurosPago = scanner.nextInt();

        System.out.println(eurosPorPagar + " " + eurosPago);

        int diferenciaPago = eurosPago - eurosPorPagar; 
        System.out.println(diferenciaPago);

        int cambioBilleteCien = diferenciaPago / 100;
        System.out.println(cambioBilleteCien + " billete(s) de 100 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCien * 100);

        int cambioBilleteCincuenta = diferenciaPago / 50;
        System.out.println(cambioBilleteCincuenta + " billete(s) de 50 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCincuenta * 50);

        int cambioBilleteVeinte = diferenciaPago / 20;
        System.out.println(cambioBilleteVeinte + " billete(s) de 20 €");
        diferenciaPago = diferenciaPago - (cambioBilleteVeinte * 20);

        int cambioBilleteDiez = diferenciaPago / 10;
        System.out.println(cambioBilleteDiez + " billete(s) de 10 €");
        diferenciaPago = diferenciaPago - (cambioBilleteDiez * 10);

        int cambioBilleteCinco = diferenciaPago / 5;
        System.out.println(cambioBilleteCinco + " billete(s) de 5 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCinco * 5);

        int cambioMonedaDos = diferenciaPago / 2;
        System.out.println(cambioMonedaDos + " moneda(s) de 2 €");
        diferenciaPago = diferenciaPago - (cambioMonedaDos * 2);

        int cambioMonedaUno = diferenciaPago / 1;
        System.out.println(cambioMonedaUno + " moneda(s) de 1 €");

        scanner.close();
    }
}
