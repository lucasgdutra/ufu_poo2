package lab6.home_broker;

import lab6.IObservable;
import lab6.IObserver;

public class AcaoBrokerObserver implements IObserver {
    private String nome;
    private double valor;
    private double limiteMinimo;
    private double limiteMaximo;
    private int quantidade;

    public AcaoBrokerObserver(double limiteMinimo, double limiteMaximo) {
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.quantidade = 0;
    }

    public void Vender(int quantidade) {
        if (this.quantidade > 0) {
            if (this.quantidade >= quantidade) {
                this.quantidade -= quantidade;
            } else {
                this.quantidade = 0;
            }
        }
    }

    public void Comprar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void update(IObservable observable) {
        this.nome = ((AcaoObservable) observable).getNome();
        this.valor = ((AcaoObservable) observable).getValor();

        if (this.valor < this.limiteMinimo) {
            this.Comprar(1);
        }

        if (this.valor > this.limiteMaximo) {
            this.Vender(this.quantidade);
        }
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

}
