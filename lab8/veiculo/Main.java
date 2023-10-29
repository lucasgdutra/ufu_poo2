package lab8.veiculo;

public class Main {
    public static void main(String args[]){
        Veiculo carro = new Carro("Fiat", "Uno", "Vermelho");
        Veiculo onibus = new Onibus(70, 2015);
        Veiculo bicicleta = new Bicicleta("Verde");

        VeiculoVisitor visitor = new VeiculoOperacoes();

        carro.accept(visitor);
        onibus.accept(visitor);
        bicicleta.accept(visitor);
    }
}
