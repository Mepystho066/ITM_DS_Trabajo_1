package modulos;

public abstract class Billetes {
    int CantidadBilletes;
    int Valor;
    Procesos retiro;

    public Billetes(int CantidadBilletes,int Valor, Procesos retiro) {
        this.CantidadBilletes = CantidadBilletes;
        this.Valor = Valor;
        this.retiro = retiro;
    }

    abstract public void entregarBillete( int cantidad);

    public int getCantidadBilletes() {
        return CantidadBilletes;
    }
    public void setCantidadBilletes(int cantidadBilletes) {
        CantidadBilletes = cantidadBilletes;
    }
  
}
