package veiculos.honda;

import veiculos.IVehicle;

public class Fit implements IVehicle {

    @Override
    public void start() {
        System.out.println("Ligando o Honda Fit");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Honda Fit");
    }

    @Override
    public void stop() {
        System.out.println("Parando o Honda Fit");
    }

}
