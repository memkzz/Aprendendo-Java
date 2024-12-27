package acadeny.devdojo.maratonajava.javacore.introducaoclasses.test;

import acadeny.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.idade = 12;
        estudante01.nome = "Jorge";
        estudante01.sexo = 'M';
        System.out.println(estudante01.nome+" "+estudante01.idade+" "+estudante01.sexo);
    }
}
