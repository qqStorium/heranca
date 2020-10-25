package jogo;
public class Pergunta {
    private String dica;
    private String resposta;
    public Pergunta(String dica, String resposta) {
        this.dica = dica;
        this.resposta = resposta;
    }
    public Pergunta() {
        
    }
    public String getDica() {
        return dica;
    }
    public void setDica(String dica) {
        this.dica = dica;
    }
    public String getResposta() {
        return resposta;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
