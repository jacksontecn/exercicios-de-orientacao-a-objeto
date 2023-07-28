package Exercicio_1;

public class Tecnico {

    private Assistente assistente;
    private double bonusSalarial;

    public Assistente getAssistente() {
        return assistente;
    }

    public void setAssistente(Assistente assistente) {
        this.assistente = assistente;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    public double ganhoAnual(){
        double ganhoAnual;

        ganhoAnual = (assistente.getFuncionario().getSalary()
        * 12 ) + bonusSalarial;

        return ganhoAnual;
    }

    public void exibeDados(){

        System.out.println("Matricula: " + getAssistente().getMatricula());
        System.out.println("Nome: " + getAssistente().getFuncionario().getName());
        System.out.printf("Salario: %.2f\n", getAssistente().getFuncionario().getSalary());
        System.out.printf("Bônus Salarial: R$ %.2f\n", getBonusSalarial());
        System.out.printf("Ganho Anual: R$ %.2f", ganhoAnual());

    }
}
