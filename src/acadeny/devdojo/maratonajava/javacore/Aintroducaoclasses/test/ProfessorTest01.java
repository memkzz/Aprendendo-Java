package acadeny.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import acadeny.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        professor01.nome = "Alberto";
        professor01.idade = 43;
        professor01.sexo = 'M';
        System.out.println("Nome do Professor: "+professor01.nome+"\nIdade do Professor: "+professor01.idade+"\nSexo do Professor: "+professor01.sexo);
    }

}
