package ex5;
import ex1.*;
import ex3.*;
import ex4.*;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Tecnico Administrativo: ");;;
        String nome = sc.nextLine();
        System.out.print("Digite o setor: ");
        String setor = sc.nextLine();
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite a matricula: ");
        String matricula = sc.next();
        System.out.print("Digite o turno [D/N]: ");
        String turno = sc.nextLine();
        Administrativo tecnicoAdministrativo = null;
        if(turno.equals("N")) {
            System.out.println("Digite o adicional noturno: ");
            double adicionalNoturno = sc.nextDouble();
            tecnicoAdministrativo = new Administrativo(nome, setor, salario, matricula, turno, adicionalNoturno);
        } else {
            tecnicoAdministrativo = new Administrativo(nome, setor, salario, matricula, turno);
        }
        System.out.print("Digite o nome do Tecnico: ");
        String nomeT = sc.nextLine();
        System.out.print("Digite o setor: ");
        String setorT = sc.nextLine();
        System.out.print("Digite o salário: ");
        double salarioT = sc.nextDouble();
        System.out.print("Digite a matricula: ");
        String matriculaT = sc.next();
        System.out.print("Digite o bonus: ");
        double bonusT = sc.nextDouble();
        Tecnico tecnico = new Tecnico(nomeT, setorT, salarioT, matriculaT, bonusT);
        System.out.println("Nome: " + tecnicoAdministrativo.getNome() + " Matricula: " + tecnicoAdministrativo.getMatricula());
        System.out.println("Nome: " + tecnico.getNome() + " Matricula: " + tecnico.getMatricula());
        System.out.println("1 - Ingresso normal");
        System.out.println("2 - Ingresso VIP");
        int opcaoIngresso = sc.nextInt();
        Ingresso ingresso = null;
        if(opcaoIngresso == 1) {
            ingresso = new Normal();
            System.out.println("Seu ingresso é normal");
            System.out.println("O valor do seu ingresso é de: R$" + ingresso.getValor());
        } else if(opcaoIngresso == 2) {
            ingresso = new Vip();
            System.out.println("Seu ingresso é vip");
            System.out.println("1 - Camarote superior");
            System.out.println("2 - Camarote inferior");
            int opcaoCamarote = sc.nextInt();
            if(opcaoCamarote == 1) {
                System.out.println("Seu ingresso vip no camarote superior");
                CamaroteSuperior camarote = new CamaroteSuperior();
                System.out.println("O valor do seu ingresso é de: R$" + camarote.getValor());
            } else if(opcaoCamarote == 2) {
                System.out.println("Seu ingresso vip no camarote inferior");
                CamaroteInferior camarote = new CamaroteInferior();
                System.out.println("O valor do seu ingresso é de: R$" + camarote.getValor());
            } else {
                System.out.println("Opção inválida");
            }
        } else {
            System.out.println("Opção inválida");
        }
    Imovel imovel = null;
        System.out.print("Digite o preço do imovel: ");
        double preco = sc.nextDouble();
        System.out.print("Digite o endereço do imovel: ");
        String endereco = sc.next();
        System.out.println("1 - Imovel novo");
        System.out.println("2 - Imovel velho");
        int opcaoImovel = sc.nextInt();
        if(opcaoImovel == 1) {
           imovel = new Novo(endereco, preco);
        } else if(opcaoImovel == 2) {
            imovel = new Velho(endereco, preco);
        } else {
            System.out.println("Opção inválida!");
        }
        System.out.println("O preço do imovel é de: R$" + imovel.getPreco());
    }
}