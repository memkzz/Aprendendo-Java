package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimirDados(){
        System.out.println("---Funcionário---");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        for (double i: salario){
            System.out.print(i+" ");
        }

    }
    public void imprimirMediaSalario(){
        double  media = 0;
        for (double i: salario){
            media+= i;
        }
        media/= salario.length;
        System.out.println("Média salarial: "+media);

    }
}
