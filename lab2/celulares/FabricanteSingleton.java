package celulares;

import celulares.apple.AppleFactory;
import celulares.samsung.SamsungFactory;

public class FabricanteSingleton {
    private static FabricanteCelular samsung;
    private static FabricanteCelular apple;

    private static final Object lock = new Object();

    private FabricanteSingleton() {
    }

    public static FabricanteCelular getInstance(String fabricante) {
        Fabricantes fabricanteEnum = Fabricantes.valueOf(fabricante.toUpperCase());
        switch (fabricanteEnum) {
            case SAMSUNG:
                if (samsung == null) {
                    // Garante que apenas uma thread por vez entre no bloco
                    synchronized (lock) {
                        if (samsung == null) {
                            samsung = new SamsungFactory();
                        }
                    }
                }
                return samsung;
            case APPLE:
                if (apple == null) {
                    // Garante que apenas uma thread por vez entre no bloco
                    synchronized (lock) {
                        if (apple == null) {
                            apple = new AppleFactory();
                        }
                    }
                }
                return apple;
            default:
                throw new IllegalArgumentException("Fabricante " + fabricante + " não existe");
        }
    }
}