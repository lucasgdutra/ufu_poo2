public class AeroPortoObserver implements IObserver {
    private double velocidadeVento;

    @Override
    public void update(IObservable observable) {
        this.velocidadeVento = ((CetObservable) observable).getVelocidadeVento();
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }

}
