package modulos2;

public class Procesos {
    public static void main(String[] args) {
        Billetes restriccion  = new Restriccion(); 
        Billetes cincoMill = new CincoMill(5000, 50);
        Billetes diesMill = new DiesMill(10000 , 50);
        Billetes veinteMill = new VeiteMill(20000, 50);
        Billetes cincuentaMill = new CincuentaMill(50000, 50);
        Billetes cienMill =  new CienMill(100000, 50);
        int entrada  = 155000;
        
        restriccion.setSiguiente(cienMill);
        cienMill.setSiguiente(cincuentaMill);
        cincuentaMill.setSiguiente(veinteMill);
        veinteMill.setSiguiente(diesMill);
        diesMill.setSiguiente(cincoMill);
        
        restriccion.entregar(entrada);
        //diesmill.entregar(entrada);
    }
}
