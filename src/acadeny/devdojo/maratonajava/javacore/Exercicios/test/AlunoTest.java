package acadeny.devdojo.maratonajava.javacore.Exercicios.test;

import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno();

        aluno.nome = "Carlos Miguel";
        aluno.nota = 6.6;
        aluno.idade = 17;

        aluno1.nome = "Otávio Luís";
        aluno.idade = 16;
        aluno1.nota = 9.4;

        aluno.exibirInformacoes();
        aluno1.exibirInformacoes();

    }
}
