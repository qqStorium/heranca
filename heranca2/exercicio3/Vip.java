package ex3;
public class Vip extends Ingresso{
    protected double adicional;
    public Vip() {
        this.adicional = 20;
        this.valor += 20;
    }
    public void imprimeValor() {
        System.out.println(this.valor);
    }
    @Override
    public double getValor() {
        return this.valor;
    }
    public double getAdicional() {
        return adicional;
    }
    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
