package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public int vender(){
        if (quantidadeEstoque > 0){
            return quantidadeEstoque--;
        }
        else {
            return 0;
        }
    }
    public int reporEstoque(){
        return quantidadeEstoque++;
    }
    public void exibirProduto(){
        if (quantidadeEstoque <= 0){
            System.out.println("Acabou o Produto! Aguarde repormos o estoque.");
        }
        else {
        System.out.println("--PRODUTO--");
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Quantidade em Estoque: "+quantidadeEstoque);}
    }
}
