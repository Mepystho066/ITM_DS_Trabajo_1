package modulos;

public class Billete5mill extends Billetes {
    
    public Billete5mill(int CantidadBilletes, int Valor , Procesos retiro) {
        super(CantidadBilletes,Valor,retiro);
        
    }

    @Override
    public void entregarBillete(int cantidad ) {      

        if  (cantidad != 0)  { 
            
            int CBilletes =  this.CantidadBilletes; 
            int rt = cantidad / this.Valor ; 
            int billetes  =  CBilletes -rt ; 
            
            if (rt >= CBilletes){
                setCantidadBilletes(billetes);
                System.out.println("Se entrega cantidad de : " + rt + "Billete" + this.Valor);
               
                retiro.ejecutar(cantidad);
                
            }
        
            else {
                
                retiro.ejecutar(cantidad);
            }
        
        }

    }
}