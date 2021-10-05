// Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ OK - Construa um método que imprima uma mensagem para ser usada como cabeçalho da aplicação. A mensagem deve exibir a mensagem “Calculadora”.
//_ Construa um método que imprima o menu de opções contendo as opções somar, subtratir, multiplicar e dividir.
//_ Construa um método que solicite ao usuario que ele digite uma das opções do menu, armazene a opção em uma variável, valide o valor e retorne apenas quando uma opção válida for digitada.
//_ Crie um método que receba a opção escolhida pelo usuário e encaminhe para o método que irá realizar a operação correta, seja de soma, subtração, multiplicação e divisão.
//_ Construa os metodos de soma,  subtração, multiplicação e divisão.Todos os métodos devem receber dois parâmetros double realizar a operação e retornar o valor do cálculo.
//_ Imprima o resultado das operações fora do metodo que realiza o cálculo.

import java.util.Scanner;

public class Atv014 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        menu();
        int opcao = validamenu();
        seleciona_menu(opcao);

    }

    static void cabecalho() {
        System.out.println("========== Calculadora ========== \n");
    }

    static void menu() {
        System.out.println("\t1- Soma");
        System.out.println("\t2- Subtração");
        System.out.println("\t3- Multiplicação");
        System.out.println("\t4- Divisão ");
    }

    static int validamenu(){
        int opcao;
        do {
            opcao = ler("Digite uma opção do menu");
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Redigite: ");
            }
            while (opcao < 1 || opcao > 4) ;
            return opcao;

        }while (opcao < 1 || opcao > 4);
    }

    static int seleciona_menu(int opcao) {
        switch (opcao) {
            case 1:
                int n1 = ler("Digite o n1: ");
                int n2 = ler("Digite o n2: ");
                double soma = soma(n1, n2);
                System.out.printf("A soma é: %d\n", soma);
                break;

            case 2:
                int n3 = ler("Digite o n3: ");
                int n4 = ler("Digite o n4: ");
                double subtracao = subtracao(n3, n4);
                System.out.printf("A subtração é: %d\n", subtracao);
                break;

            case 3:
                int n5 = ler("Digite o n3: ");
                int n6 = ler("Digite o n4: ");
                double multiplicacao = multiplicacao(n5, n6);
                System.out.printf("A Multiplicação é: %d\n", multiplicacao);
                break;

            case 4:
                int n7 = ler("Digite o n3: ");
                int n8 = ler("Digite o n4: ");
                double divisao = divisao(n7, n8);
                System.out.printf("A divisão é: %d\n", divisao);
                break;
        }
        return seleciona_menu(opcao);
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


    }

