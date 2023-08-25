package veiculos.toyota;

import veiculos.IVehicle;

public class Etios implements IVehicle {

    @Override
    public void start() {
        System.out.println("Ligando o Toyota Etios");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Toyota Etios");
    }

    @Override
    public void stop() {
        System.out.println("Parando o Toyota Etios");
    }

}
