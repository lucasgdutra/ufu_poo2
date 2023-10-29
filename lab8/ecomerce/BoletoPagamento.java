
public class BoletoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("logica para pagar com boleto");
        System.out.println("total: " + total);
    }

}