package cabs1;
public class Pessoa {
    private String nome;
    private String dataNascimento;
    @Override 
    public String toString(){
        return "Nome: "  + this.nome + "\nData de nascimento: " + this.dataNascimento;
    }
    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
