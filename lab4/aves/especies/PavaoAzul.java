package lab4.aves.especies;

import lab4.aves.adaptadores.PavaoAdpater;
import lab4.aves.adaptados.Pavao;

public class PavaoAzul extends PavaoAdpater{

    public PavaoAzul(Pavao pavao) {
        super(pavao);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Pavão azul");
        super.emitirSom();
    }
}
