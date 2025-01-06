package acadeny.devdojo.maratonajava.javacore.Exercicios.test;

import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Local;
import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Seminar;
import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Student;
import acadeny.devdojo.maratonajava.javacore.Exercicios.domai.Teacher;

public class SeminarTest {
    public static void main(String[] args) {
        Student student = new Student("Felipe Mateus", 16);
        Student student1 = new Student("Joana Darc", 16);

        Teacher teacher = new Teacher("Alceudes Clovis", "History");
        Teacher teacher1 = new Teacher("Dandara Sousa","Geography");

        Seminar seminar = new Seminar("World Geopolitics");
        Seminar seminar1 = new Seminar("Africa History");

        Local local = new Local("Science Laboratory");
        Local local1 =  new Local("School Gym");

        Seminar[] seminars = {seminar1, seminar};
        Student[] students = {student, student1};

        student.setSeminar(seminar);
        student1.setSeminar(seminar);

        seminar.setOnelocal(local1);

        teacher.setSeminars(seminars);
        seminar.setStudents(students);

        seminar.print();
        System.out.println("______");
        teacher.print();



    }
}
