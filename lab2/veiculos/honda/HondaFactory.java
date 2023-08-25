package veiculos.honda;

import veiculos.IVehicle;
import veiculos.IVehicleMaker;

public class HondaFactory implements IVehicleMaker {
    public HondaFactory() {
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        // Uso de Factory: O método makeVehicle é responsável por criar objetos de diferentes modelos de veículos.
        // Isso abstrai a lógica de criação dos objetos, tornando o código mais modular e mais fácil de manter.
        ModelosHonda modeloHonda = ModelosHonda.valueOf(modelo);
        switch (modeloHonda) {
            case CIVIC:
                return new Civic();
            case CITY:
                return new City();
            case FIT:
                return new Fit();
            default:
                throw new IllegalArgumentException("Modelo inválido");
        }
    }

}
