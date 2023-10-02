import java.util.ArrayList;
import java.util.List;

import lab6.IObservable;
import lab6.IObserver;

public class CetObservable implements IObservable {
    private List<IObserver> observers = new ArrayList<>();

    private double temperatura;
    private double umidade;
    private double pressao;
    private double velocidadeVento;

    public CetObservable(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }

    public void setVelocidadeVento(double velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
    }

    CetObservable() {
        this.temperatura = 0;
        this.umidade = 0;
        this.pressao = 0;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public double getUmidade() {
        return this.umidade;
    }

    public double setPressao(double pressao) {
        return this.pressao = pressao;
    }

    public double getPressao() {
        return this.pressao;
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
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