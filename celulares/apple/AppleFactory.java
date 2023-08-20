package celulares.apple;

import celulares.Celular;
import celulares.FabricanteCelular;

public class AppleFactory implements FabricanteCelular {
    @Override
    public Celular constroiCelular(String modelo) {
        Modelos modeloEnum = Modelos.valueOf(modelo);
        switch (modeloEnum) {
            case IPHONE_X:
                return new IPhoneX();
            case IPHONE_11:
                return new IPhone11();
            default:
                throw new IllegalArgumentException("Modelo " + modelo + " não existe");
        }
    }
}
