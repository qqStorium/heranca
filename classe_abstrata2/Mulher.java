package cabs1;
public class Mulher extends PessoaIMC {
    public Mulher(double altura, double peso, String nome, String dataNascimento) {
        super(altura, peso, nome, dataNascimento);
    }
    @Override
    public String resultIMC() {
        double imc = this.calculaIMC(this.getAltura(), this.getPeso());
        if(imc > 25.8){
            return "Acima do peso ideal";
        } else if(imc < 25.8 && imc > 19){
            return "Peso ideal";
        } else if(imc < 19){
            return "Abaixo do peso ideal";
        }
        return null;
    }
}
