package Exercicio_2b;

public class ApplicationMain {
    public static void main(String[] args) {

        Rica rica = new Rica();
        Pobre pobre = new Pobre();
        Miseravel miseravel = new Miseravel();

        rica.setNome("Joaquim");
        rica.setIdade(35);
        rica.setDinheiro(50.00);
        System.out.println();
        rica.fazCompra();

        System.out.println();
        System.out.println();

        pobre.setNome("Pedro");
        pobre.setIdade(18);
        pobre.trabalhar();

        System.out.println();
        System.out.println();

        miseravel.setNome("Juvenal");
        miseravel.setIdade(46);
        miseravel.mendiga();

        System.out.println();


    }
}
