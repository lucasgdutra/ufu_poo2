
public class PixPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("logica para pagar com pix");
        System.out.println("total: " + total);
    }

}