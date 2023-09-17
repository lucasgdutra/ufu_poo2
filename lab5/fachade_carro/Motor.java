package lab5.fachade_carro;

public class Motor {
    private boolean ligado;

    public Motor() {
        this.ligado = false;
    }

    public void Ligar() {
        this.ligado = true;
    }

    public void Desligar() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }
}
