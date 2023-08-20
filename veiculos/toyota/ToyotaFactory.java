package veiculos.toyota;

import veiculos.IVehicle;
import veiculos.IVehicleMaker;

public class ToyotaFactory implements IVehicleMaker {
    public ToyotaFactory() {
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        // Uso de Factory: O método makeVehicle é responsável por criar objetos de diferentes modelos de veículos.
        // Isso abstrai a lógica de criação dos objetos, tornando o código mais modular e mais fácil de manter.
        ModelosToyota modeloToyota = ModelosToyota.valueOf(modelo);
        switch (modeloToyota) {
            case HILUX:
                return new Hilux();
            case COROLLA:
                return new Corolla();
            case ETIOS:
                return new Etios();
            default:
                throw new IllegalArgumentException("Modelo inválido");
        }
    }

}
