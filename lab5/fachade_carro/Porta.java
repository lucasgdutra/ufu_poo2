package lab5.fachade_carro;

public class Porta {
    private boolean aberta;

    public Porta() {
        this.aberta = false;
    }

    public void Abrir() {
        this.aberta = true;
    }

    public void Fechar() {
        this.aberta = false;
    }

    public boolean isAberta() {
        return aberta;
    }
}
