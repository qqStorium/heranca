package cabs1;
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList();
        while(true){
            System.out.println("1. Cadastra Homem\n2. Cadastrar Mulher\n3. Consultar IMC (Busca pelo nome)\n4. Listar Homens\n5. Listar Mulheres\n6. Listar todos os IMCs dos Homens\n7. Listas todos os IMCs\n0. Sair");
            int escolha = teclado.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = teclado.next();
                    System.out.println("Digite sua altura: ");
                    double altura = teclado.nextDouble();
                    System.out.println("Digite sua data de nascimnto: ");
                    String dataNascimento = teclado.next();
                    System.out.println("Digite seu peso: ");
                    double peso = teclado.nextDouble();
                    Homem homem = new Homem(altura, peso, nome, dataNascimento);
                    pessoas.add(homem);
                break;
                case 2:
                    System.out.println("Digite seu nome: ");
                    nome = teclado.next();
                    System.out.println("Digite sua altura: ");
                    altura = teclado.nextDouble();
                    System.out.println("Digite sua data de nascimnto: ");
                    dataNascimento = teclado.next();
                    System.out.println("Digite seu peso: ");
                    peso = teclado.nextDouble();
                    Mulher mulher = new Mulher(altura, peso, nome, dataNascimento);
                    pessoas.add(mulher);
                break;
                case 3:
                    System.out.println("Nome para a consulta: ");
                    nome = teclado.next();
                    for(int i = 0; i < pessoas.size(); i++){
                        if(pessoas.get(i) instanceof Mulher) {
                            Mulher m = (Mulher) pessoas.get(i);
                            if(m.getNome().equals(nome)){
                                System.out.println(m.resultIMC());
                            }
                        } else if(pessoas.get(i) instanceof Homem) {
                            Homem h = (Homem) pessoas.get(i);
                            if(h.getNome().equals(nome)){
                                System.out.println(h.resultIMC());
                            }
                        }
                        
                    }
                break;
                case 4:
                    for(int i = 0; i < pessoas.size(); i++){
                        if(pessoas.get(i) instanceof Homem) {
                            Homem h = (Homem) pessoas.get(i);
                            System.out.println(h.getNome());
                        } 
                    }
                break;
                case 5:
                    for(int i = 0; i < pessoas.size(); i++){
                        if(pessoas.get(i) instanceof Mulher) {
                            Mulher m = (Mulher) pessoas.get(i);
                            System.out.println(m.getNome());
                        } 
                    }
                break;
                case 6:
                    for(int i = 0; i < pessoas.size(); i++){
                        if(pessoas.get(i) instanceof Homem) {
                            Homem h = (Homem) pessoas.get(i);
                            System.out.println(h.getNome() + " - " + h.resultIMC());
                        } 
                    }
                break;
                case 7:
                    for(int i = 0; i < pessoas.size(); i++){
                        if(pessoas.get(i) instanceof Mulher) {
                            Mulher m = (Mulher) pessoas.get(i);
                            System.out.println(m.getNome() + " - " +m.resultIMC());
                        } else if(pessoas.get(i) instanceof Homem) {
                            Homem h = (Homem) pessoas.get(i);
                            System.out.println(h.getNome() + " - " + h.resultIMC());
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
