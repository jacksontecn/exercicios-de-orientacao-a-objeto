package Exercicio_2a;

public class ApplicationMain {
    public static void main(String[] args) {

        System.out.println();

        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Tekoo");
        cachorro.setRaca("Pitcher Raivoso");
        System.out.println(cachorro.caminha());
        System.out.println(cachorro.late());

        System.out.println();
        System.out.println();

        String animal = "Suncheiser";

        Gato gato = new Gato();
        gato.setNome(animal);
        gato.setRaca("Garfield");
        System.out.println(gato.caminha());
        System.out.println(gato.mia());

    }
}
