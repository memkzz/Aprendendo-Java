package acadeny.devdojo.maratonajava.javacore.Hheritage.domain;

public class Employee extends Person {
    private double salary;

    static {
        System.out.println("Inside the static employee block");
    }
    {
        System.out.println("Inside the employee initialization block 1");
    }
    {
        System.out.println("Inside the employee initialization block 2");
    }


    public Employee(String name, String cpf){
        super(name, cpf);
        System.out.println("Inside builder employee");
    }

    public Employee(String name, String cpf, double salary) {
        super(name, cpf);
        this.salary = salary;
    }

    public void paymentRelatory(){
        System.out.println("Pagamendo de:"+this.name+" PAGO! "+this.salary+" VALOR");
    }

    public void print(){
        super.print();
        System.out.println("Salary: "+this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
