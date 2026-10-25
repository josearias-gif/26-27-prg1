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

        final int VALOR_BILLETE_CIEN = 100;
        final int VALOR_BILLETE_CINCUENTA = 50; 
        final int VALOR_BILLETE_VEINTE = 20;
        final int VALOR_BILLETE_DIEZ = 10;
        final int VALOR_BILLETE_CINCO = 5;
        final int VALOR_MONEDA_DOS = 2;
        final int VALOR_MONEDA_UNO = 1;

        int cambioBilleteCien = diferenciaPago / VALOR_BILLETE_CIEN;
        System.out.println(cambioBilleteCien + " billete(s) de 100 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCien * VALOR_BILLETE_CIEN);

        int cambioBilleteCincuenta = diferenciaPago / VALOR_BILLETE_CINCUENTA;
        System.out.println(cambioBilleteCincuenta + " billete(s) de 50 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCincuenta * VALOR_BILLETE_CINCUENTA);

        int cambioBilleteVeinte = diferenciaPago / VALOR_BILLETE_VEINTE;
        System.out.println(cambioBilleteVeinte + " billete(s) de 20 €");
        diferenciaPago = diferenciaPago - (cambioBilleteVeinte * VALOR_BILLETE_VEINTE);

        int cambioBilleteDiez = diferenciaPago / VALOR_BILLETE_DIEZ;
        System.out.println(cambioBilleteDiez + " billete(s) de 10 €");
        diferenciaPago = diferenciaPago - (cambioBilleteDiez * VALOR_BILLETE_DIEZ);

        int cambioBilleteCinco = diferenciaPago / VALOR_BILLETE_CINCO;
        System.out.println(cambioBilleteCinco + " billete(s) de 5 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCinco * VALOR_BILLETE_CINCO);

        int cambioMonedaDos = diferenciaPago / VALOR_MONEDA_DOS;
        System.out.println(cambioMonedaDos + " moneda(s) de 2 €");
        diferenciaPago = diferenciaPago - (cambioMonedaDos * VALOR_MONEDA_DOS);

        int cambioMonedaUno = diferenciaPago / VALOR_MONEDA_UNO;
        System.out.println(cambioMonedaUno + " moneda(s) de 1 €");

        scanner.close();
    }
}
