package lab5.fachade_carro;

public class Cinto {
    private boolean travado;

    public Cinto() {
        this.travado = false;
    }

    public void Travar() {
        this.travado = true;
    }

    public void Destravar() {
        this.travado = false;
    }

    public boolean isTravado() {
        return travado;
    }
}
