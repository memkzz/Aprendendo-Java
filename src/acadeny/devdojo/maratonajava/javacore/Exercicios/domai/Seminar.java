package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Seminar {
    private String title;
    private Student[] students;
    private Local onelocal;

    public Seminar(String title) {
        this.title = title;
    }

    public Seminar(String title, Student[] students, Local onelocal) {
        this.title = title;
        this.students = students;
        this.onelocal = onelocal;
    }

    public void print(){
        System.out.println("Seminar: "+this.title);
        if (students == null) return;
        for (Student student: students){
            System.out.println("Student: "+student.getName());
        }
        System.out.println("Local Seminar: "+onelocal.getAddress());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Local getOnelocal() {
        return onelocal;
    }

    public void setOnelocal(Local onelocal) {
        this.onelocal = onelocal;
    }

}
