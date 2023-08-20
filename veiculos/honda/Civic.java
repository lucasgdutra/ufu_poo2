package veiculos.honda;

import veiculos.IVehicle;

public class Civic implements IVehicle {

    @Override
    public void start() {
        System.out.println("Ligando o Honda Civic");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Honda Civic");
    }

    @Override
    public void stop() {
        System.out.println("Parando o Honda Civic");
    }

}
