package celulares;

public class App {
    public static void main(String[] args) throws Exception {
        FabricanteCelular samsung = FabricanteSingleton.getInstance("samsung");
        Celular s20 = samsung.constroiCelular("S20");
        s20.fazLigacao();
    }
}