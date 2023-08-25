package veiculos.toyota;

import veiculos.IVehicle;

public class Corolla implements IVehicle {

    @Override
    public void start() {
        System.out.println("Ligando o Toyota Corolla");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Toyota Corolla");
    }

    @Override
    public void stop() {
        System.out.println("Parando o Toyota Corolla");
    }

}
