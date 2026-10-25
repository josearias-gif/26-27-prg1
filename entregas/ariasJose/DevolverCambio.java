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

        int cambioBilleteCincuenta = (diferenciaPago - (cambioBilleteCien * 100)) / 50;
        System.out.println(cambioBilleteCincuenta + " billete(s) de 50 €");

        int cambioBilleteVeinte = (diferenciaPago - (cambioBilleteCien * 100) - (cambioBilleteCincuenta * 50)) / 20;
        System.out.println(cambioBilleteVeinte + " billete(s) de 20 €");

        int cambioBilleteDiez = (diferenciaPago - (cambioBilleteCien * 100) - (cambioBilleteCincuenta * 50) - (cambioBilleteVeinte * 20)) / 10;
        System.out.println(cambioBilleteDiez + " billete(s) de 10 €");

        int cambioBilleteCinco = (diferenciaPago - (cambioBilleteCien * 100) - (cambioBilleteCincuenta * 50) - (cambioBilleteVeinte * 20) - (cambioBilleteDiez * 10)) / 5;
        System.out.println(cambioBilleteCinco + " billete(s) de 5 €");

        int cambioMonedaDos = (diferenciaPago - (cambioBilleteCien * 100) - (cambioBilleteCincuenta * 50) - (cambioBilleteVeinte * 20) - (cambioBilleteDiez * 10) - (cambioBilleteCinco * 5)) / 2;
        System.out.println(cambioMonedaDos + " moneda(s) de 2 €");

        int cambioMonedaUno = (diferenciaPago - (cambioBilleteCien * 100) - (cambioBilleteCincuenta * 50) - (cambioBilleteVeinte * 20) - (cambioBilleteDiez * 10) - (cambioBilleteCinco * 5) - (cambioMonedaDos * 2)) / 1;
        System.out.println(cambioMonedaUno + " moneda(s) de 1 €");

        scanner.close();
    }
}
