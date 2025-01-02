package acadeny.devdojo.maratonajava.javacore.Exercicios.test;

import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("José");
        pessoa.setAge(0);
        pessoa.setHeight(1.73);

        pessoa.displayInformation();

    }
}
