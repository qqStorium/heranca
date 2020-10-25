package questao1;

public class ContaEspecial extends ContaBancaria{
    protected float limite;
    
    public ContaEspecial(String nome, int numero, float saldo, float limite) {
        this.nomeCliente = nome;
        this.numeroConta = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    @Override
    public void sacar(float valor) {
        if(this.getSaldo() - valor >= this.limite) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque de " + valor + "realizado com sucesso!\n");
        } else {
            System.out.println("Sem saldo suficiente! Valor fora do limite!\n");
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public void getDados() {
        System.out.println("Nome: " + this.nomeCliente
        +"\nNúmero da conta: " + this.numeroConta
        +"\nSaldo: " + this.saldo
        +"\nLimite: " + this.limite + "\n");
    }
    
}
