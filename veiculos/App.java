package veiculos;

public class App {
    public static void main(String[] args) {
        // Uso de Singleton e Factory: Aqui, a fábrica única de cada marca é obtida através do Singleton.
        // Em seguida, os veículos são criados usando o método makeVehicle da fábrica, que é uma implementação do padrão Factory.
       
        IVehicleMaker honda = FabricantesSingleton.getInstance(FabricantesEnum.HONDA.name());
        IVehicle civic = honda.makeVehicle(veiculos.honda.ModelosHonda.CIVIC.name());
        civic.start();
        civic.drive();
        civic.stop();

        IVehicle city = honda.makeVehicle(veiculos.honda.ModelosHonda.CITY.name());
        city.start();
        city.drive();
        city.stop();

        IVehicleMaker toyota = FabricantesSingleton.getInstance(FabricantesEnum.TOYOTA.name());
        IVehicle corolla = toyota.makeVehicle(veiculos.toyota.ModelosToyota.COROLLA.name());
        corolla.start();
        corolla.drive();
        corolla.stop();

    }
}
