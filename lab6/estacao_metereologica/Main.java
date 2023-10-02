public class Main {
    public static void main(String[] args) {
        CetObservable cet = new CetObservable(20, 50, 1000);
        AeroPortoObserver aeroporto = new AeroPortoObserver();
        cet.addObserver(aeroporto);

        PrefeituraObserver prefeitura = new PrefeituraObserver();
        cet.addObserver(prefeitura);

        cet.setTemperatura(40);
        cet.setUmidade(90);
        cet.setPressao(900);
        cet.setVelocidadeVento(10);

        cet.notifyObservers();

        System.out.println("Aeroporto - Velocidade do vento: " + aeroporto.getVelocidadeVento());

        System.out.println("Prefeitura - Lista de alertas: " + prefeitura.getAlertas());
    }
}
