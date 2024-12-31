package acadeny.devdojo.maratonajava.javacore.Exercicios.test;

import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Jonas";
        funcionario.idade = 27;
        funcionario.salario = new double[]{1393.5,3991,1200};
        funcionario.imprimirDados();
        funcionario.imprimirMediaSalario();

    }
}
