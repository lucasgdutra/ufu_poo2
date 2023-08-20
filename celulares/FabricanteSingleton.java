package celulares;

import celulares.samsung.SamsungFactory;

public class FabricanteSingleton {
    private static FabricanteCelular samsung;

    private FabricanteSingleton() {
    }

    public static FabricanteCelular getInstance(String fabricante) {
        switch (fabricante) {
            case "samsung":
                if (samsung == null) {
                    samsung = new SamsungFactory();
                }
                return samsung;
            default:
                throw new Error("Fabricante " + fabricante + " não existe");
        }
    }
}