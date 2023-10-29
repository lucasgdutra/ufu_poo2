package lab8.veiculo;

public interface VeiculoVisitor {
    void visit(Carro carro);

    void visit(Onibus onibus);

    void visit(Bicicleta bicicleta);
}
