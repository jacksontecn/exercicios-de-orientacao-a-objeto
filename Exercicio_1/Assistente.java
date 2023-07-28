package Exercicio_1;

public class Assistente{

    private long matricula;
    private Funcionario funcionario;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void exibeDados(){

        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome: " + getFuncionario().getName());
        System.out.printf("Salario: %.2f\n", getFuncionario().getSalary());
        System.out.printf("Ganho Anual: R$ %.2f", getFuncionario().ganhoAnual());

    }

}
