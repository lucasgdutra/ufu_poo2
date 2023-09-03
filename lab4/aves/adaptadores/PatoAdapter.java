package lab4.aves.adaptadores;

import lab4.aves.adaptados.Pato;

public class PatoAdapter implements Ave {
    private Pato pato;

    public PatoAdapter(Pato pato) {
        this.pato = pato;
    }

    public void voar() {
        this.pato.voar();
    }

    public void emitirSom() {
        this.pato.grasnar();
    }
}
