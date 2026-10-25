import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        double eurosPorPagar = scanner.nextDouble();

        System.out.println("¿Con cuántos euros paga?");
        double eurosPago = scanner.nextDouble();

        System.out.println(eurosPorPagar + " " + eurosPago);

        double diferenciaPago = eurosPago - eurosPorPagar; 
        System.out.println(diferenciaPago);

        final int VALOR_BILLETE_CIEN = 100;
        final int VALOR_BILLETE_CINCUENTA = 50; 
        final int VALOR_BILLETE_VEINTE = 20;
        final int VALOR_BILLETE_DIEZ = 10;
        final int VALOR_BILLETE_CINCO = 5;
        final int VALOR_MONEDA_DOS = 2;
        final int VALOR_MONEDA_UNO = 1;
        final double VALOR_MONEDA_CINCUENTA_CENTIMOS = 0.50;
        final double VALOR_MONEDA_VEINTE_CENTIMOS = 0.20;
        final double VALOR_MONEDA_DIEZ_CENTIMOS = 0.10;
        final double VALOR_MONEDA_CINCO_CENTIMOS = 0.05;
        final double VALOR_MONEDA_DOS_CENTIMOS = 0.02;
        final double VALOR_MONEDA_UN_CENTIMO = 0.01;

        double cambioBilleteCien = diferenciaPago / VALOR_BILLETE_CIEN;
        System.out.println(cambioBilleteCien + " billete(s) de 100 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCien * VALOR_BILLETE_CIEN);

        double cambioBilleteCincuenta = diferenciaPago / VALOR_BILLETE_CINCUENTA;
        System.out.println(cambioBilleteCincuenta + " billete(s) de 50 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCincuenta * VALOR_BILLETE_CINCUENTA);

        double cambioBilleteVeinte = diferenciaPago / VALOR_BILLETE_VEINTE;
        System.out.println(cambioBilleteVeinte + " billete(s) de 20 €");
        diferenciaPago = diferenciaPago - (cambioBilleteVeinte * VALOR_BILLETE_VEINTE);

        double cambioBilleteDiez = diferenciaPago / VALOR_BILLETE_DIEZ;
        System.out.println(cambioBilleteDiez + " billete(s) de 10 €");
        diferenciaPago = diferenciaPago - (cambioBilleteDiez * VALOR_BILLETE_DIEZ);

        double cambioBilleteCinco = diferenciaPago / VALOR_BILLETE_CINCO;
        System.out.println(cambioBilleteCinco + " billete(s) de 5 €");
        diferenciaPago = diferenciaPago - (cambioBilleteCinco * VALOR_BILLETE_CINCO);

        double cambioMonedaDos = diferenciaPago / VALOR_MONEDA_DOS;
        System.out.println(cambioMonedaDos + " moneda(s) de 2 €");
        diferenciaPago = diferenciaPago - (cambioMonedaDos * VALOR_MONEDA_DOS);

        double cambioMonedaUno = diferenciaPago / VALOR_MONEDA_UNO;
        System.out.println(cambioMonedaUno + " moneda(s) de 1 €");
        diferenciaPago = diferenciaPago - (cambioMonedaUno * VALOR_MONEDA_UNO);



        scanner.close();
    }
}
