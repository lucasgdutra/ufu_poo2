package veiculos;

import veiculos.honda.HondaFactory;
import veiculos.toyota.ToyotaFactory;

public class FabricantesSingleton {
    // Singleton para as instâncias de fábricas de veículos

    private static IVehicleMaker fabricaToyota = null;
    private static IVehicleMaker fabricaHonda = null;

    // Bloqueio para garantir a criação única de instância (thread-safe)
    private static final Object lock = new Object();

    // Construtor privado para prevenir instanciação
    private FabricantesSingleton() {
    }

    // Método para obter a instância única de uma fábrica
    public static IVehicleMaker getInstance(String fabricante) {
        // Uso de Singleton: Aqui garantimos que uma única instância de cada fábrica seja criada.
        // Isso é útil se a criação da fábrica for um processo caro ou se você quiser
        // garantir que todas as partes do código usem a mesma instância de fábrica.

        // O uso de Enums implementa um sistema de tipagem forte que evita erros causados por erros de digita;ão.
        FabricantesEnum fabricanteEnum = FabricantesEnum.valueOf(fabricante.toUpperCase());

        switch (fabricanteEnum) {
            case TOYOTA:
                if (fabricaToyota == null) {
                    synchronized (lock) {
                        if (fabricaToyota == null) {
                            fabricaToyota = new ToyotaFactory();
                        }
                    }

                }
                return fabricaToyota;
            case HONDA:
                if (fabricaHonda == null) {
                    synchronized (lock) {
                        if (fabricaHonda == null) {
                            fabricaHonda = new HondaFactory();
                        }
                    }
                }
                return fabricaHonda;
            default:
                throw new IllegalArgumentException("Fabricante inválido");
        }

    }
}
