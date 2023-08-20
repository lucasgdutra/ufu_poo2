package celulares.samsung;

import celulares.Celular;
import celulares.FabricanteCelular;

public class SamsungFactory implements FabricanteCelular {
    public SamsungFactory() {

    }

    @Override
    public Celular constroiCelular(String modelo) {
        switch (modelo) {
            case "S20":
                return new S20();

            default:
                throw new Error("Modelo " + modelo + " não existe");

        }
    }

}