package ex3;
public class Ingresso {
    protected double valor;
    public void imprimeValor() {
        System.out.println(this.valor);
    }
    public Ingresso() {
        this.valor = 40;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}