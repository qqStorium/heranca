package questao1;

public class ContaBancaria {
    protected String nomeCliente;
    protected int numeroConta;
    protected float saldo;
    
    public void sacar(float valor) {
        if(this.saldo - valor < 0) {
            System.out.println("Você não tem dinheiro suficiente para fazer o saque!\n");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de valor " + valor + "\n");
        }
    }
    
    public void depositar(float valor) {
        this.saldo += valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso\n");
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
