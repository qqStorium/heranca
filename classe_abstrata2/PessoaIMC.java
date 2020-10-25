package cabs1;
public abstract class PessoaIMC extends Pessoa {
    private double altura;
    private double peso;
    public PessoaIMC(double altura, double peso, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.altura = altura;
        this.peso = peso;
    }
    public PessoaIMC(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }
    public double calculaIMC(double altura, double peso){
        return peso/(altura*altura);
    }
    public abstract String resultIMC();
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "\nData de nascimento: " + this.getDataNascimento() + "\nPeso: " + this.peso + "Altura: " + this.altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}