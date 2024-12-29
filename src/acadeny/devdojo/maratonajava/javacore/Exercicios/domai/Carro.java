package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    public void exibirDetalhes(){
        System.out.println("--CARRO--");
        System.out.println("Nome: "+nome);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Idade do carro: "+idadeCarro());
    }
    public int idadeCarro(){
        int idade = 2024 - ano;
        return idade;
    }

}
