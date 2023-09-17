package lab5.fachade_carro;

public class Carro {
    private Motor motor;
    private Porta porta;
    private Cinto cinto;
    private Farol farol;
    private Radio radio;

    public Carro() {
        this.motor = new Motor();
        this.porta = new Porta();
        this.cinto = new Cinto();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void RotinaInicio() {
        this.motor.Ligar();
        this.porta.Fechar();
        this.cinto.Travar();
        this.farol.Acender();
        this.radio.Ligar();
        this.radio.Sintonizar(95.1);
    }

    public void RotinaFim() {
        this.motor.Desligar();
        this.porta.Abrir();
        this.cinto.Destravar();
        this.farol.Apagar();
        this.radio.Desligar();
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.RotinaInicio();

        System.out.println("Motor ligado: " + carro.motor.isLigado());
        System.out.println("Porta aberta: " + carro.porta.isAberta());
        System.out.println("Cinto travado: " + carro.cinto.isTravado());
        System.out.println("Farol aceso: " + carro.farol.isAceso());
        System.out.println("Radio ligado: " + carro.radio.isLigado());
        System.out.println("Radio sintonizado em: " + carro.radio.getEstacao());

        carro.RotinaFim();

        System.out.println("Motor ligado: " + carro.motor.isLigado());
        System.out.println("Porta aberta: " + carro.porta.isAberta());
        System.out.println("Cinto travado: " + carro.cinto.isTravado());
        System.out.println("Farol aceso: " + carro.farol.isAceso());
        System.out.println("Radio ligado: " + carro.radio.isLigado());
        System.out.println("Radio sintonizado em: " + carro.radio.getEstacao());

    }
}
