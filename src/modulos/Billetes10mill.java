package modulos;

public class Billetes10mill extends Billetes {
    
    public Billetes10mill(int CantidadBilletes,int Valor ,Procesos retiro){
        super(CantidadBilletes,Valor,retiro);
        
    }


    public void entregarBillete(int cantidad){
            
        if  (cantidad != 0)  { 
            int rt = cantidad / Valor ; 
            if ( CantidadBilletes >= rt  ){
            setCantidadBilletes(CantidadBilletes -rt );
            retiro.ejecutar(cantidad);
           
            }
            else {
                System.out.print("Se agotaron los billetes de " + Valor);
            }
        }
    }


}
