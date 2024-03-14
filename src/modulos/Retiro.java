package modulos;

public class Retiro implements Procesos {
    public Procesos siguienteProceso;

    public void setSiguiente(Procesos siguienteProceso){
        this.siguienteProceso = siguienteProceso;
    }
    
    public void ejecutar(int cantidad) {
       if ((cantidad % 5 ) == 0){
            if (siguienteProceso != null ){
                siguienteProceso.ejecutar(cantidad);
            }
            else{
                System.out.println("No se tienen mas procesos en la cadena "); // Test cambiar 
            }
        }
        else {
            System.out.print("La cantidad que intentas retirar no es posible ");
        }
    }
}
