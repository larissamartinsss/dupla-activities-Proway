package views;

import controller.ProdutosController;
import models.Produtos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produtos = new Produtos();
        ProdutosController produtosController = new ProdutosController();

        Produtos p1 = new Produtos();
        p1.id = 1;
        p1.nome = "Iphone SE";
        p1.descricao = "2º geração, 64GB";
        p1.preco = 2659.00;
        p1.categorias.smartphone = "Iphone";


        Produtos p2 = new Produtos();
        p2.id = 2;
        p2.nome = " Boneca ";
        p2.descricao = " Sereia ";
        p2.preco = 85.99;
        p2.categorias.brinquedos = "Boneca Barbie ";


        Produtos p3 = new Produtos();
        p3.id = 3;
        p3.nome = " Notebook Gamer Acer ";
        p3.descricao = "Nitro 5";
        p3.preco = 5000.00;
        p3.categorias.computadores = " Notebook i5 ";

        imprimir(p1);
        imprimir(p2);
        imprimir(p3);

        System.out.println("Digite uma das opções abaixo: ");
        System.out.println("\n---------------MENU----------------\n" +
                "\n1-Adicionar: \n" +
                "\n2-Atualizar" +
                "\n3-Deletar" +
                "\n4-Existe");
        int opcao = Integer.parseInt(sc.next());

        switch (opcao){
            case 1:
                System.out.println("------------------ Adicionar ------------------ \n");
                produtosController.create(p1);
                produtosController.create(p2);
                produtosController.create(p3);


                break;

            case 2:
                System.out.println("------------------ Atualizar ------------------ \n");


                break;

            case 3:
                System.out.println("------------------ Deletar ------------------ \n");
                produtosController.delete(p3);

                break;

            case 4:
                System.out.println("------------------ Existir ------------------ \n");


                break;
        }


    }

    public static void imprimir(Object obj){
        System.out.println(obj.toString());
    }



}
