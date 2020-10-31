/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TesteAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList();
        
        int opcao = 1;
        while(opcao != 0) {
            
            System.out.println("1) Incluir dados relativo a um peixe;\n" +
"2) Incluir dados relativo a um mamífero;\n" +
"3) Listar todos os animais cadastrados;\n" +
"4) Lista todos os peixes cadastrados");
            
            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome do peixe: ");
                    String nomePeixe = sc.next();
                    System.out.println("Digite o comprimento do peixe: ");
                    double comprimentoPeixe = sc.nextDouble();
                    System.out.println("Digite a velocidade do peixe em m/s: ");
                    double velocidadePeixe = sc.nextDouble();
                    System.out.println("Digite o número de barbatanas do peixe: ");
                    int barbatanas = sc.nextInt();
                    System.out.println("Digite o número de caudas do peixe: ");
                    int caudas = sc.nextInt();
                    
                    Peixe peixe = new Peixe(nomePeixe, comprimentoPeixe, velocidadePeixe, barbatanas, caudas);
                    animais.add(peixe);
                    
                    System.out.println("Peixe cadastrado com sucesso!\n");
                break;
                case 2:
                    System.out.println("Digite o nome do mamifero: ");
                    String nomeMamifero = sc.next();
                    System.out.println("Digite o comprimento do mamifero: ");
                    double comprimentoMamifero = sc.nextDouble();
                    System.out.println("Digite a velocidade do mamifero em m/s: ");
                    double velocidadeMamifero = sc.nextDouble();
                    System.out.println("Digite a cor do mamifero: ");
                    String cor = sc.next();
                    System.out.println("Digite o alimento preferido do mamifero: ");
                    String alimento = sc.next();
                    
                    Mamifero mamifero = new Mamifero(nomeMamifero, comprimentoMamifero, cor, velocidadeMamifero, alimento);
                    animais.add(mamifero);
                    
                    System.out.println("Mamifero cadastrado com sucesso!\n");
                break;
                case 3:
                    if(animais.size() == 0) {
                        System.out.println("Nenhum animal cadastrado, CADASTRE ANTES SEU ANIMAL :)");
                    } else {
                        System.out.println("Animais cadastrados: ");
                        
                        for(int i = 0; i < animais.size(); i++) {
                            System.out.println(animais.get(i).getNome());
                        }
                    }
                break;
                case 4:
                    for(int i = 0; i < animais.size(); i++) {
                        if(animais.get(i) instanceof Peixe) {
                            Peixe p = (Peixe) animais.get(i);
                            System.out.println(p.getNome());
                        }        
                    }
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}
