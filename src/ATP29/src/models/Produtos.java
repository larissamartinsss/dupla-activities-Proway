//Crie um sistema de cadastro de Produtos e Categorias.
//_  O Produto deve possuir Categoria como atributo.
//_  O sistema deve utilizar o padrão de arquitetura MVC
//_  Os modelos devem possuir um id e outros atributos públicos de sua escolha.
//_  As controllers devem possuir os quatro métodos de CRUD e deve utilizar um ArrayList privado para manter os dados. (Utilize o conceito de Generics nas Controllers)
//_  A view deve testar as operações de CRUD para cada controller.
//_  A view deve possuir um menu para que o usuário escolha as opções de CRUD.

package models;

public class Produtos extends Base {
    public String nome;
    public Double preco;
    public String descricao;
    public Categorias categorias;  //composicao

    @Override
    public boolean equals (Object obj) {
        if (obj instanceof Produtos) {
            Produtos outra = (Produtos)obj;
            if(this.id == outra.id){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString(){
        return  "----------------- Produto -----------------" +
                "\n\tNome = " + this.nome +
                "\n\tPreco = " + this.preco +
                "\n\tDescricao =  " + this.descricao +
                " " +
                "\n";
    }
}
