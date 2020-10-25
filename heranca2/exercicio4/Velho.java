package ex4;
public class Velho extends Imovel{
    protected double desconto;
    public Velho(String endereco, double preco) {
        super(endereco, preco);
        this.desconto = 10;
        this.preco -= (this.preco*10)/100;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}