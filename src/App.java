import java.util.Scanner;

import modulos2.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Billetes restriccion = new Restriccion();
        Billetes cincoMill = new CincoMill(5000, 50);
        Billetes diesMill = new DiesMill(10000, 50);
        Billetes veinteMill = new VeiteMill(20000, 50);
        Billetes cincuentaMill = new CincuentaMill(50000, 50);
        Billetes cienMill = new CienMill(100000, 50);

        System.out.print("Cantidad A retirar es :");

        int entrada = sc.nextInt();

        restriccion.entregar(entrada);

        restriccion.setSiguiente(cienMill);
        cienMill.setSiguiente(cincuentaMill);
        cincuentaMill.setSiguiente(veinteMill);
        veinteMill.setSiguiente(diesMill);
        diesMill.setSiguiente(cincoMill);

        // diesmill.entregar(entrada);
    }
}