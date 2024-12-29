package acadeny.devdojo.maratonajava.javacore.Exercicios.test;

import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Creatina IntegralMedica";
        produto.preco = 82.50;
        produto.quantidadeEstoque = 7;

        produto.exibirProduto();
        produto.vender();
        produto.exibirProduto();
        produto.reporEstoque();
        produto.exibirProduto();
        produto.vender();
        produto.vender();
        produto.vender();
        produto.vender();
        produto.exibirProduto();
        produto.vender();
        produto.vender();
        produto.vender();
        produto.exibirProduto();
        produto.reporEstoque();
        produto.reporEstoque();
        produto.reporEstoque();
        produto.exibirProduto();


    }
}
