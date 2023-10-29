package lab8.veiculo;

public class Onibus  implements Veiculo{
    private int quantidadeDeLugares;
    private int anoDeFabricacao;

    public Onibus(int quantidadeDeLugares, int anoDeFabricacao) {
        this.quantidadeDeLugares = quantidadeDeLugares;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getQuantidadeDeLugares() {
        return quantidadeDeLugares;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    @Override
    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}
