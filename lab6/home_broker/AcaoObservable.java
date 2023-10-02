package lab6.home_broker;

import java.util.ArrayList;
import java.util.List;

import lab6.IObservable;
import lab6.IObserver;

public class AcaoObservable implements IObservable {
    private String nome;
    private double valor;

    private List<IObserver> observers = new ArrayList<>();

    public AcaoObservable(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
        observer.update(this);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : this.observers) {
            observer.update(this);
        }
    }

}
