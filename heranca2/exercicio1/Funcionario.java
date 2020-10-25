package ex1;
public class Funcionario {
    protected String nome;
    protected String setor;
    protected double salario;
    public Funcionario(String nome, String setor, double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void exibirDados() {
        System.out.println("Nome: " + this.nome + "\nSetor: " + this.setor + "\nSalário: " + this.salario);
    }
}