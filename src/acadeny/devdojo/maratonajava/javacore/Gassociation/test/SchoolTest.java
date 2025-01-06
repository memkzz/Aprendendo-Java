package acadeny.devdojo.maratonajava.javacore.Gassociation.test;

import acadeny.devdojo.maratonajava.javacore.Gassociation.domain.School;
import acadeny.devdojo.maratonajava.javacore.Gassociation.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Girafales");
        Teacher teacher1 = new Teacher("Luxemburgo");
        Teacher[] teachers = {teacher, teacher1};
        School school = new School(teachers,"INSF");

        school.imprime();
    }
}
