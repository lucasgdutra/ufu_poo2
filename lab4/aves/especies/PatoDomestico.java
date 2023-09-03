package lab4.aves.especies;

import lab4.aves.adaptadores.PatoAdapter;
import lab4.aves.adaptados.Pato;

public class PatoDomestico extends PatoAdapter{

    public PatoDomestico(Pato pato) {
        super(pato);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Pato doméstico");
        super.emitirSom();
    }

}
