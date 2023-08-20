package veiculos.toyota;

import veiculos.IVehicle;

public class Hilux implements IVehicle {

    @Override
    public void start() {
        System.out.println("Ligando o Toyota Hilux");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Toyota Hilux");
    }

    @Override
    public void stop() {
        System.out.println("Parando o Toyota Hilux");
    }

}
