package teste;

import java.util.Scanner;

public class Atv14_versao2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n \n ========== Calculadora ==========");
        int opcao = 0;
        char retorno;
        do {
            do {
                opcao = menu();
            } while (!validarMenu(opcao));
            exibirMensagem(opcao);
            retorno = retornoMenu();

        } while (validarRetornoMenu(retorno));

    }

    static int menu() {
        System.out.println("\t1- Soma");
        System.out.println("\t2- Subtração");
        System.out.println("\t3- Multiplicação");
        System.out.println("\t4- Divisão ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;

    }

    static boolean validarMenu(int opcao) {
        if (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida, por favor: \n");
            return false;
        } else {
            return true;
        }
    }

    // Poderia ter usado o Swith Case:
    static void exibirMensagem(int opcao) {
        switch (opcao) {
            case 1:
                int n1 = ler("Digite o 1º número: ");
                int n2 = ler("Digite 2º número: ");
                double soma = soma(n1, n2);
                System.out.println("A soma é: " + soma);
                break;
            case 2:
                int n3 = ler("Digite o 1º número: ");
                int n4 = ler("Digite 2º número: ");
                double subtracao = subtracao(n3, n4);
                System.out.println("A subtração é: " + subtracao);
                break;
            case 3:
                int n5 = ler("Digite 1º número: ");
                int n6 = ler("Digite 2º número: ");
                double multiplicacao = multiplicacao(n5, n6);
                System.out.println("A Multiplicação é: " + multiplicacao);
                break;
            case 4:
                int n7 = ler("Digite 1º número: ");
                int n8 = ler("Digite 2º número: ");
                double divisao = divisao(n7, n8);
                System.out.println("A divisão é: "+ divisao);
                break;
        }

    }
        static int ler(String mensagem) {
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    static double soma(double n1, double n2) {
        double soma = n1 + n2;
        return soma;
    }

    static double subtracao(double n1, double n2) {
        double subtracao = n1 - n2;
        return subtracao;
    }

    static double multiplicacao(double n1, double n2) {
        double multiplicacao = n1 * n2;
        return multiplicacao;
    }

    static double divisao(double n1, double n2) {
        double divisao = n1 / n2;
        return divisao;
    }

    static char retornoMenu() {
        char retorno;
        do {
            System.out.println("\n Deseja voltar ao menu principal? \n Digite 'V' para retornar ou digite 'S' para sair");
            retorno = sc.nextLine().toUpperCase().charAt(0);
        } while (retorno != 'V' && retorno != 'S');
        return retorno;
    }

    static boolean validarRetornoMenu(char retorno) {
        boolean retornar = false;
        if (retorno == 'V') {
            System.out.println("Você retornou ao menu: \n");
            retornar = true;
        } else {
            System.out.println("========== Obrigado! ==========");
        }
        return retornar;
    }

}
