import java.util.List;
import java.util.ArrayList;

public class PrefeituraObserver implements IObserver {
    private double temperatura;;
    private double umidade;
    private double pressao;
    private double velocidadeVento;

    private List<String> alertas = new ArrayList<>();

    @Override
    public void update(IObservable observable) {
        this.temperatura = ((CetObservable) observable).getTemperatura();
        this.umidade = ((CetObservable) observable).getUmidade();
        this.pressao = ((CetObservable) observable).getPressao();
        this.velocidadeVento = ((CetObservable) observable).getVelocidadeVento();

        if (this.temperatura > 30) {
            this.alertas.add("Temperatura acima de 30 graus");
        }

        if (this.umidade > 80) {
            this.alertas.add("Umidade acima de 80%");
        }

        if (this.pressao < 1000) {
            this.alertas.add("Pressão abaixo de 1000");
        }

        if (this.velocidadeVento > 50) {
            this.alertas.add("Velocidade do vento acima de 50 km/h");
        }
    }

    public void limparAlertas() {
        this.alertas.clear();
    }

    public List<String> getAlertas() {
        return alertas;
    }
}
