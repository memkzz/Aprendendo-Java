package acadeny.devdojo.maratonajava.javacore.Gassociation.domain;

public class School {
    private String name;
    private Teacher[] teachers;

    public School(Teacher[] teachers, String name) {
        this.teachers = teachers;
        this.name = name;
    }

    public School(String name) {
        this.name = name;
    }

    public void imprime(){
        System.out.println("Name Scholl: "+this.name);
        if (teachers == null) return;
        for (Teacher teacher:teachers){
            System.out.println(teacher.getName());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
