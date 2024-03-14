package modulos2;

public class CincuentaMill implements Billetes{
    Billetes siguiente; 
    int valorBillete, cantidadBilletes;
        
    public CincuentaMill( int valorBillete, int cantidadBilletes ){
        this.valorBillete =  valorBillete;
        this.cantidadBilletes = cantidadBilletes;
    }

    public void setSiguiente(Billetes siguiente) {
        this.siguiente = siguiente;
    }
    
    public void entregar(int cantidad){
        if (cantidad != 0 ){
            int billetes = cantidad /valorBillete;
            
            if(cantidadBilletes >=billetes  ){
                setCantidadBilletes(cantidadBilletes-billetes);
                cantidad -= valorBillete * billetes;
                System.out.println("Se entregan " + billetes + " de"  + valorBillete);
                if (siguiente != null) {siguiente.entregar(cantidad);}
            }
            
            else{
                System.out.println("Sin billetes de " + this.valorBillete);
                if (siguiente != null){
                    siguiente.entregar(cantidad);
                }
            }
        }

    }

    public void setCantidadBilletes(int cantidadBilletes) {
        this.cantidadBilletes = cantidadBilletes;
    }

}
