package Exercicio_2b;

public class Rica extends Pessoa{

    private double dinheiro;

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void fazCompra(){
        System.out.println(getNome() + " gastou " + getDinheiro() + " fazendo compras!");
    }

}
