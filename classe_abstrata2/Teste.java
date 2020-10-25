package cabs1;
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Homem> homens = new ArrayList();
        ArrayList<Mulher> mulheres = new ArrayList();
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
                    homens.add(homem);
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
                    mulheres.add(mulher);
                break;
                case 3:
                    System.out.println("Nome para a consulta: ");
                    nome = teclado.next();
                    for(int i = 0; i < homens.size(); i++){
                        Homem h = homens.get(i);
                        if(h.getNome().equals(nome)){
                            System.out.println(h.resultIMC());
                        }
                    }
                    for(int i = 0; i < mulheres.size(); i++){
                        Mulher m = mulheres.get(i);
                        if(m.getNome().equals(nome)){
                            System.out.println(m.resultIMC());
                        }
                    }
                break;
                case 4:
                    for(int i = 0; i < homens.size(); i++){
                        Homem h = homens.get(i);
                        System.out.println(h.getNome());
                    }
                break;
                case 5:
                    for(int i = 0; i < mulheres.size(); i++){
                        Mulher m = mulheres.get(i);
                        System.out.println(m.getNome());
                    }
                break;
                case 6:
                    for(int i = 0; i < homens.size(); i++){
                        Homem h = homens.get(i);
                        System.out.println(h.getNome() + " - " + h.resultIMC());
                    }
                break;
                case 7:
                    for(int i = 0; i < homens.size(); i++){
                        Homem h = homens.get(i);
                        System.out.println(h.getNome() + " - " + h.resultIMC());
                    }
                    for(int i = 0; i < mulheres.size(); i++){
                        Mulher m = mulheres.get(i);
                        System.out.println(m.getNome() + " - " + m.resultIMC());
                    }
                break;
                default:
                    System.exit(0);
                break;
            }
        }
    }
}
