package jogo;
public class PerguntaDificil extends Pergunta {
    private String segundaDica;
    public PerguntaDificil(String segundaDica, String dica, String resposta) {
        super(dica, resposta);
        this.segundaDica = segundaDica;
    }
    public PerguntaDificil() {
        
    }
    public String getSegundaDica() {
        return segundaDica;
    }
    public void setSegundaDica(String segundaDica) {
        this.segundaDica = segundaDica;
    }
}
