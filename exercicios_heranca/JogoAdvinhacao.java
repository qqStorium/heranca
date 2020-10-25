package jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class JogoAdvinhacao {
    private Jogador jogadorUm;
    private Jogador jogadorDois;
    private int pontuacaoJogadorUm;
    private int pontuacaoJogadorDois;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pergunta> perguntas = new ArrayList();
        ArrayList<PerguntaDificil> perguntasDificeis = new ArrayList();
        for(int i = 0; i < 4; i++) {
            System.out.print("Digite a dica da perguta: ");
            String dica = teclado.nextLine();
            System.out.print("Digite a resposta: ");
            String resposta = teclado.nextLine();
            Pergunta pergunta = new Pergunta(dica, resposta);
            perguntas.add(pergunta);
        }
        for(int i = 0; i < 2; i++){
            System.out.print("Digite a dica 1 da pergunta dificil: ");
            String dica = teclado.nextLine();
            System.out.print("Digite a dica 2 da pergunta dificil: ");
            String dica2 = teclado.nextLine();
            System.out.print("Digite a resposta: ");
            String resposta = teclado.nextLine();
            PerguntaDificil pergunta = new PerguntaDificil(dica2, dica, resposta);
            perguntasDificeis.add(pergunta);
        }
        System.out.print("Digite o nome do primeiro jogador: ");
        String nomeJogador1 = teclado.nextLine();
        Jogador jogador1 = new Jogador(nomeJogador1, 0);
        System.out.print("Digite o nome do segundo jogador: ");
        String nomeJogador2 = teclado.nextLine();
        Jogador jogador2 = new Jogador(nomeJogador2, 0);
        JogoAdvinhacao jogo = new JogoAdvinhacao(jogador1, jogador2, 0, 0);
        jogo.realizarPergunta(perguntas.get(0), jogador1);
        jogo.realizarPergunta(perguntas.get(1), jogador1);
        jogo.realizarPergunta(perguntas.get(2), jogador2);
        jogo.realizarPergunta(perguntas.get(3), jogador2);
        if(jogo.obterVencedor() != null) {
            System.out.println("O vencedor é " + jogo.obterVencedor());
        } else {
            jogo.realizarPergunta(perguntasDificeis.get(0), jogador1);
            jogo.realizarPergunta(perguntasDificeis.get(1), jogador1);
            jogo.realizarPergunta(perguntasDificeis.get(0), jogador2);
            jogo.realizarPergunta(perguntasDificeis.get(1), jogador2);
            if(jogo.obterVencedor() != null) {
                System.out.println("O vencedor é " + jogo.obterVencedor());
            } else {
                System.out.println("Ninguem venceu!");
            }
        }
    }
    public JogoAdvinhacao(Jogador jogadorUm, Jogador jogadorDois, int pontuacaoJogadorUm, int pontuacaoJogadorDois) {
        this.jogadorUm = jogadorUm;
        this.jogadorDois = jogadorDois;
        this.pontuacaoJogadorUm = pontuacaoJogadorUm;
        this.pontuacaoJogadorDois = pontuacaoJogadorDois;
    }
    public JogoAdvinhacao() {
       
    }
    public void realizarPergunta(Pergunta pergunta, Jogador jogador) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(jogador.getNome() + " a dica é: " + pergunta.getDica() + ": ");
        String resposta = teclado.nextLine();
        if(pergunta.getResposta().equals(resposta)){
            int pontos = jogador.getQuantidadePontos();
            pontos += 10;
            jogador.setQuantidadePontos(pontos);
        } else {
            System.out.println("A resposta está errada!");
        }
    }
    public void realizarPergunta(PerguntaDificil pergunta, Jogador jogador) {
        Scanner sc = new Scanner(System.in);
        System.out.print(jogador.getNome() + " a dica é: " + pergunta.getDica() + ": ");
        String resposta = sc.nextLine();
        if(pergunta.getResposta().equals(resposta)){
            int pontos = jogador.getQuantidadePontos();
            pontos += 20;
            jogador.setQuantidadePontos(pontos);
        } else {
            System.out.println("A segunda dica é: " + pergunta.getSegundaDica() + ": ");
            String resposta2 = sc.next();
            if(pergunta.getResposta().equals(resposta2)){
                int pontos = jogador.getQuantidadePontos();
                pontos += 10;
                jogador.setQuantidadePontos(pontos);
            } else {
                System.out.println("A resposta está errada!");
            }
        } 
    }
    public String obterVencedor(){
        if(this.jogadorUm.getQuantidadePontos() >= 20 && this.jogadorDois.getQuantidadePontos() >= 20) {
            return null;
        } else if(this.jogadorUm.getQuantidadePontos() < 20 && this.jogadorDois.getQuantidadePontos() < 20) {
            return null;
        } else if(this.jogadorUm.getQuantidadePontos() >= 20) {
            return this.jogadorUm.getNome();
        } else if(this.jogadorDois.getQuantidadePontos() >= 20) {
            return this.jogadorDois.getNome();
        }
        return null;
    }
    public Jogador getJogadorUm() {
        return jogadorUm;
    }
    public void setJogadorUm(Jogador jogadorUm) {
        this.jogadorUm = jogadorUm;
    }
    public Jogador getJogadorDois() {
        return jogadorDois;
    }
    public void setJogadorDois(Jogador jogadorDois) {
        this.jogadorDois = jogadorDois;
    }
    public int getPontuacaoJogadorUm() {
        return pontuacaoJogadorUm;
    }
    public void setPontuacaoJogadorUm(int pontuacaoJogadorUm) {
        this.pontuacaoJogadorUm = pontuacaoJogadorUm;
    }
    public int getPontuacaoJogadorDois() {
        return pontuacaoJogadorDois;
    }
    public void setPontuacaoJogadorDois(int pontuacaoJogadorDois) {
        this.pontuacaoJogadorDois = pontuacaoJogadorDois;
    }
    
}
