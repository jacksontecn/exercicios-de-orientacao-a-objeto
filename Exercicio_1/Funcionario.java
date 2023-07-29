package Exercicio_1;
public class Funcionario {

    private String name;
    private double salary;

    public Funcionario() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addAumento(double valor){

        this.salary += valor;
    }

    public double ganhoAnual(){
        double ganhoAnual;
        ganhoAnual = salary * 12;
        return ganhoAnual;
    }

    public void exibeDados(){

        System.out.println("Nome: "+ name);
        System.out.printf("Salario: %.2f\n", salary);
        System.out.printf("Ganho Anual: R$ %.2f", ganhoAnual());

    }

}
