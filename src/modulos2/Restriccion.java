package modulos2;

public class Restriccion implements Billetes {
    Billetes siguiente;

    public void setSiguiente(Billetes siguiente) {
        this.siguiente = siguiente;
    }

    public void entregar(int cantidad) {
        if ((cantidad % 5000) == 0) {
            siguiente.entregar(cantidad);

        } else {
            System.out.print("La Cantidad a retirar no se puede");
        }
    }
}
