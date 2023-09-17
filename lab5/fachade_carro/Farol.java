package lab5.fachade_carro;

public class Farol {
    private boolean aceso;

    public Farol() {
        this.aceso = false;
    }

    public void Acender() {
        this.aceso = true;
    }

    public void Apagar() {
        this.aceso = false;
    }

    public boolean isAceso() {
        return aceso;
    }

}
