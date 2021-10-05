package modulo1.atividades;
import java.util.Scanner;

// Atividade em dupla - Flávia e Larissa - 16/09

public class CadastroDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********** Cadastro de Desenvolvedores e Linguagens **********");
        System.out.println("Digite sua opção: " +
                "\n1 - cadastrar dev;" +
                "\n2 - cadastrar linguagem; " +
                "\n0 - sair ");
        short opcao = sc.nextShort();
        sc.nextLine();
        boolean invalido = true;
        System.out.printf("Você escolheu a opção %d", opcao);
        String nome = " ";
        String sobrenome = " ";
        String nivel = " ";
        short idade = 0;
        switch (opcao) {
            case 0:
                System.out.printf("\nSaindo... \n");
                break;
            case 1:
                do {
                    System.out.printf("\nDigite o nome do Dev: ");
                    nome = sc.next();
                    sc.nextLine();
                    if (nome.length() <= 3) {
                        System.out.println("\nO nome deve conter no mínimo 3 letras.");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido);
                invalido = true;
                do {
                    System.out.printf("\nDigite o sobrenome do Dev: ");
                    sobrenome = sc.next();
                    sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("\nO sobrenome deve conter no mínimo 3 letras.");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido);
                invalido = true;
                do {
                    System.out.printf("\nDigite o nível do Dev: ");
                    nivel = sc.next();
                    sc.nextLine();
                    if (nivel.length() < 3) {
                        System.out.println("\nO nível deve conter no mínimo 3 letras.");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido);
                invalido = true;
                do {
                    System.out.printf("\nDigite a idade do Dev: ");
                    idade = sc.nextShort();
                    sc.nextLine();
                    if (idade <= 0) {
                        System.out.println("\nA idade deve ser maior do que 0.");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido);
                System.out.printf("Você cadastrou:" +
                                "%s %s como dev, " +
                                "com %d anos e" +
                                "nível %s ",
                        nome, sobrenome, idade, nivel);
                break;
            case 2:
                String nomeling = " ";
                String descricao = " ";
                String aplicacao = " ";
                System.out.println("Digite a opção para o tipo de aplicação: " +
                        "\n1 - Frontend;" +
                        "\n2 - Backend; " +
                        "\n3 - Mobile ");
                int op2 = sc.nextInt();
                System.out.printf("Você escolheu %d", op2);
                switch (op2) {
                    case 1:
                        aplicacao = "Frontend";
                        do {
                            System.out.printf("\nDigite o nome da linguagem de %s: ", aplicacao);
                            nomeling = sc.next();
                            sc.nextLine();
                            if (nomeling.length() < 3) {
                                System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
                            } else {
                                invalido = false;
                            }
                        }
                        while (invalido);
                        invalido = true;
                        do {
                            System.out.printf("\nDigite a descrição da linguagem: ");
                            descricao = sc.next();
                            sc.nextLine();
                            if (descricao.length() < 3) {
                                System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
                            } else {
                                invalido = false;
                            }
                        }
                        while (invalido);
                        System.out.printf("Você cadastrou:" +
                                        "\naplicação: %s" +
                                        "\nlinguagem: %s" +
                                        "\ndescrição: %s",
                                aplicacao, nomeling, descricao);
                        break;
                    case 2:
                        aplicacao = "Backend";
                        do {
                            System.out.printf("\nDigite o nome da linguagem de %s: ", aplicacao);
                            nomeling = sc.next();
                            sc.nextLine();
                            if (nomeling.length() < 3) {
                                System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
                            } else {
                                invalido = false;
                            }
                        }
                        while (invalido);
                        invalido = true;
                        do {
                            System.out.printf("\nDigite a descrição da linguagem: ");
                            descricao = sc.next();
                            sc.nextLine();
                            if (descricao.length() < 3) {
                                System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
                            } else {
                                invalido = false;
                            }
                        }
                        while (invalido);
                        System.out.printf("Você cadastrou:" +
                                        "\naplicação: %s" +
                                        "\nlinguagem: %s" +
                                        "\ndescrição: %s",
                                aplicacao, nomeling, descricao);
                        break;
                    case 3:
                        aplicacao = "Mobile";
                        do {
                            System.out.printf("\nDigite o nome da linguagem de %s: ", aplicacao);
                            nomeling = sc.next();
                            sc.nextLine();
                            if (nomeling.length() < 3) {
                                System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
                            } else {
                                invalido = false;
                            }
                        }
                        while (invalido);
                        invalido = true;
                        do {
                            System.out.printf("Digite a descrição da linguagem: ");
                            descricao = sc.next();
                            sc.nextLine();
                            if (descricao.length() < 3) {
                                System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
                            } else {
                                invalido = false;
                            }
                        }
                        while (invalido);
                        System.out.printf("Você cadastrou:" +
                                        "\naplicação: %s" +
                                        "\nlinguagem: %s" +
                                        "\ndescrição: %s",
                                aplicacao, nomeling, descricao);
                        break;
                } break;
            default:
                System.out.println("\nOpção inválida. Digite novamente!");
                break;
        }
    }
}



