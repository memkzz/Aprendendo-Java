package acadeny.devdojo.maratonajava.javacore.Exercicios.domai;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }
    public void print(){
        System.out.println("Teacher: "+this.name);
        if (seminars == null) return;
        for (Seminar seminar: seminars){
            System.out.println("Seminar Subject: "+seminar.getTitle());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

}
