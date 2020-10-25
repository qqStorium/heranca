package ex3;
public class CamaroteSuperior extends Vip{
    double camaroteAdicional;
    public CamaroteSuperior() {
        this.camaroteAdicional = 10;
        this.valor += 10;
    }
    public double valorDoIngresso() {
        return (this.valor + this.adicional + this.camaroteAdicional);
    }
}
