package acadeny.devdojo.maratonajava.javacore.Hheritage.domain;

public class Employee extends Person {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
    public void paymentRelatory(){
        System.out.println("Pagamendo de:"+this.name+" PAGO! "+this.salary+" VALOR");
    }

    public void print(){
        super.print();
        System.out.println(this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
