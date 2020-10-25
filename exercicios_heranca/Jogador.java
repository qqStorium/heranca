
package jogo;


public class Jogador {
    private String nome;
    private int quantidadePontos;
    public Jogador(String nome, int quantidadePontos) {
        this.nome = nome;
        this.quantidadePontos = quantidadePontos;
    }
    public Jogador() {
        
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadePontos() {
        return quantidadePontos;
    }
    public void setQuantidadePontos(int quantidadePontos) {
        this.quantidadePontos = quantidadePontos;
    }
}
