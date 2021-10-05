package modulo1.atividades;

import java.util.Scanner;
// Atividade em dupla - Larissa e Manuela - 20/09

public class AtividadeEmDupla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ========= Cadastro de numeros =========");
        // Menu:
        System.out.println("Opções para cadastro: ");
        System.out.println("1- Números pares");
        System.out.println("2- Números primos");
        System.out.println("3- números Impares");
        System.out.println("4- Calculo de números compostos");
        System.out.println("0 - Sair");
        int opcoes = sc.nextInt();
        boolean primo = true;
        sc.nextLine();
        // Switch-Case - Escolher opções

        switch (opcoes) {
            case 1:
                System.out.println("Digite o número par: ");
                int pares = sc.nextInt();
                sc.nextInt();
                for (int nPares = 2; nPares <= pares; nPares++) {
                    if (nPares % 2 == 0) {
                        System.out.println(nPares + "\n ");
                    }
                }
                break;
            case 2:
                System.out.println("Digite o número primo: ");
                int numprimo = sc.nextInt();
                sc.nextInt();
                for (int contador = 0; contador <= numprimo; contador++) {
                    for (int cont = 2; cont < contador; cont++) {
                        if (contador % cont == 0) {
                            primo = false;
                        }
                    }
                    if (primo) {
                        System.out.print(contador);
                    }
                }

                break;

                    case 3:
                        System.out.println("Digite o número impar: ");
                        int impar = sc.nextInt();
                        sc.nextInt();
                        for (int nImpar = 2; nImpar <= impar; nImpar++) {
                            if (nImpar % 2 !=0) {
                                System.out.println(nImpar + "\n ");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Calculo de números compostos: ");
                        System.out.println("Digite o valor do investimento: ");
                        double investimento = sc.nextDouble();
                        if(investimento <= 0){
                            System.out.println("Não permite número negativo, redigite: ");
                        }

                        System.out.println("Digite o prazo em número de meses: ");
                        int prazo = sc.nextInt();

                        if(prazo <= 0){
                            System.out.println("Não permite número negativo. Redigite: ");
                        }

                        System.out.println("Digite a taxa de juros mensal: ");
                        double juros = sc.nextDouble();

                        if(juros <= 0){
                            System.out.println("Não permite número negativo. Redigite: ");
                        }

                        for (int i = 0; i<prazo; i++) {
                            double totalInvest = investimento * (juros/100);
                            investimento += totalInvest;
                            System.out.printf("Mes %d: Valor do montante %2f \n", i+1, investimento);

                        }
                        break;
                    case 0:
                        System.out.println("Saindo... ");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;

                }
        }
    }


