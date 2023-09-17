package lab5.fachade_carro;

public class Radio {
    private boolean ligado;
    private double estacao;

    public Radio() {
        this.ligado = false;
        this.estacao = 0.0;
    }

    public void Ligar() {
        this.ligado = true;
    }

    public void Desligar() {
        this.ligado = false;
    }

    public void Sintonizar(double estacao) {
        if (this.ligado) {
            this.estacao = estacao;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getEstacao() {
        if (this.ligado) {
            return estacao;
        }
        return 0.0;
    }
}
