package celulares.samsung;

import celulares.Celular;
import celulares.FabricanteCelular;

public class SamsungFactory implements FabricanteCelular {
    public SamsungFactory() {

    }

    @Override
    public Celular constroiCelular(String modelo) {
        Modelos modeloEnum = Modelos.valueOf(modelo);
        switch (modeloEnum) {
            case S20:
                return new S20();
            case S21:
                return new S21();
            default:
                throw new Error("Modelo " + modelo + " não existe");

        }
    }

}