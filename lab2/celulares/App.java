package celulares;

public class App {
    public static void main(String[] args) throws Exception {
        FabricanteCelular samsung = FabricanteSingleton.getInstance(Fabricantes.SAMSUNG.name());
        Celular s20 = samsung.constroiCelular(celulares.samsung.Modelos.S20.name());
        s20.fazLigacao();

        FabricanteCelular apple = FabricanteSingleton.getInstance(Fabricantes.APPLE.name());
        Celular iPhoneX = apple.constroiCelular(celulares.apple.Modelos.IPHONE_X.name());
        iPhoneX.tiraFoto();
    }
}