package veiculos.honda;

import veiculos.IVehicle;

public class City implements IVehicle {

    @Override
    public void start() {
        System.out.println("Ligando o Honda City");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Honda City");
    }

    @Override
    public void stop() {
        System.out.println("Parando o Honda City");
    }

}
