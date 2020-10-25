/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author USER
 */
public class Mamifero extends Animal {
    protected String alimentoPreferido;

    public String getAlimentoPreferido() {
        return alimentoPreferido;
    }

    public void setAlimentoPreferido(String alimentoPreferido) {
        this.alimentoPreferido = alimentoPreferido;
    }
    
    public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimento) {
        super(nome, comprimento, cor, "terra", velocidade);
        this.alimentoPreferido = alimento;
    }
    
}
