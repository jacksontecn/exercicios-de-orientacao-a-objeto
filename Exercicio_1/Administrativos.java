package Exercicio_1;

public class Administrativos {

    private Assistente assistente;
    private String turno;
    private double adicionalNoturno;

    public Assistente getAssistente() {
        return assistente;
    }

    public void setAssistente(Assistente assistente) {
        this.assistente = assistente;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public double ganhoAnual(){
        double ganhoAnual;
        ganhoAnual = (assistente.getFuncionario().getSalary()
                + adicionalNoturno ) * 12 ;
        return ganhoAnual;
    }

    public void exibeDados(){

        System.out.println("Matricula: " + getAssistente().getMatricula());
        System.out.println("Nome: " + getAssistente().getFuncionario().getName());
        System.out.println("Turno: "+ getTurno());
        System.out.printf("Salario: %.2f\n", getAssistente().getFuncionario().getSalary());
        System.out.printf("Adicional noturno: R$ %.2f\n", getAdicionalNoturno());
        System.out.printf("Ganho Anual: R$ %.2f", ganhoAnual());

    }

}
