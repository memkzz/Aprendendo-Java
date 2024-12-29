package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Aluno {
    public String nome;
    public int idade;
    public double nota;
    public String situacao;



    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
        System.out.println("Situação: "+avaliar());
    }
    public String avaliar(){
        if (nota >= 7.0){
            situacao = "Aprovado!";
        }
        else {
            situacao = "Reprovado!";
        }
        return situacao;
    }
}

