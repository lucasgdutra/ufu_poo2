package lab8.veiculo;

class VeiculoOperacoes implements VeiculoVisitor {
    public void visit(Carro carro) {
        System.out.println("Carro: Cor: " + carro.getCor() + ", Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo());
        System.out.println("Mensagem: Favor atualizar dados do IPVA");
    }

    public void visit(Onibus onibus) {
        System.out.println("Ônibus: Quantidade de lugares: " + onibus.getQuantidadeDeLugares() + ", Ano de fabricação: "
                + onibus.getAnoDeFabricacao());
        System.out.println("Mensagem: Atenção para atualização das licenças");
    }

    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta: Cor: " + bicicleta.getCor());
        System.out.println("Mensagem: Comemore no parque o dia do ciclismo");
    }
}