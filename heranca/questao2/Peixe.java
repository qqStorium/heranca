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
public class Peixe extends Animal{
    protected int numeroBarbatanas;
    protected int numeroCaudas;

    public int getNumeroBarbatanas() {
        return numeroBarbatanas;
    }

    public void setNumeroBarbatanas(int numeroBarbatanas) {
        this.numeroBarbatanas = numeroBarbatanas;
    }

    public int getNumeroCaudas() {
        return numeroCaudas;
    }

    public void setNumeroCaudas(int numeroCaudas) {
        this.numeroCaudas = numeroCaudas;
    }
    
    public Peixe(String nome, double comprimento, double velocidade, int barbatanas, int caudas) {
        super(nome, comprimento, "cinzenta", "mar", velocidade);
        this.numeroPatas = 0;
        this.numeroBarbatanas = barbatanas;
        this.numeroCaudas = caudas;
    }
    
    
    
}
