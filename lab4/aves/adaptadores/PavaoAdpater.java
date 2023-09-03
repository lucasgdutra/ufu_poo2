package lab4.aves.adaptadores;

import lab4.aves.adaptados.Pavao;

public class PavaoAdpater implements Ave{
    private Pavao pavao;
    
    public PavaoAdpater(Pavao pavao){
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Não pode voar");
    }

    @Override
    public void emitirSom() {
        this.pavao.cantar();
    }
}
