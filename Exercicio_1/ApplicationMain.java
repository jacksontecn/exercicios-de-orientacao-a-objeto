package Exercicio_1;

import java.util.Scanner;

public class ApplicationMain {
    public static void main(String[] args) {

      //  Scanner scanner = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        Assistente assistente1 = new Assistente();
        Assistente assistente2 = new Assistente();
        Assistente assistente3 = new Assistente();

        Administrativos administrativos = new Administrativos();
        Tecnico tecnico = new Tecnico();

        System.out.println();
        funcionario1.setName("Jackson");
        funcionario1.setSalary(1200.60);

        funcionario2.setName("Elias");
        funcionario2.setSalary(1500.60);

        funcionario3.setName("Souza");
        funcionario3.setSalary(2200.60);

        System.out.println("Dados Funcionario");

        System.out.println();
        System.out.println();
        funcionario1.exibeDados();

        System.out.println();
        System.out.println();
        funcionario2.exibeDados();

        System.out.println();
        System.out.println();
        funcionario3.exibeDados();

        System.out.println();
        System.out.println();
        System.out.println("Dados Assistentes");

        System.out.println();
        System.out.println();
        assistente1.setMatricula(1);
        assistente1.setFuncionario(funcionario1);
        assistente1.exibeDados();

        System.out.println();
        System.out.println();
        assistente2.setMatricula(2);
        assistente2.setFuncionario(funcionario2);
        assistente2.exibeDados();

        System.out.println();
        System.out.println();
        assistente3.setMatricula(3);
        assistente3.setFuncionario(funcionario3);
        assistente3.exibeDados();

        System.out.println();
        System.out.println();
        System.out.println("Dados Assistentes Tecnico");

        System.out.println();
        System.out.println();
        tecnico.setAssistente(assistente2);
        tecnico.setBonusSalarial(300.55);
        tecnico.exibeDados();

        System.out.println();
        System.out.println();
        System.out.println("Dados Assistentes Administrativo");

        System.out.println();
        System.out.println();
        administrativos.setAssistente(assistente3);
        administrativos.setTurno("Diurno");
        administrativos.setAdicionalNoturno(185.20);
        administrativos.exibeDados();
        System.out.println();


        System.out.println();
        administrativos.setAssistente(assistente1);
        administrativos.setTurno("Diurno");
        administrativos.setAdicionalNoturno(680.35);
        administrativos.exibeDados();
        System.out.println();

    }
}
