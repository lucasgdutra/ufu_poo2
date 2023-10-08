package lab7;

import java.util.List;

public class Loja1 extends PedidoLojaTemplate {

    public Loja1(CanalVendas canalVendas, TipoPagamento tipoPagamento, List<Item> itens) {
        super(canalVendas, tipoPagamento, itens);
    }

    @Override
    public void processarPagamento() {

        System.out.println("Itens: ");
        for (Item item : getItens()) {
            System.out.println(item.getNome() + " - " + item.getValor());
        }

        if (getTipoPagamento() == TipoPagamento.CARTAO) {
            System.out.println("Pagamento com cartão, acrescimo de 10%");
            setValorTotal(getValorTotal() * 1.1);
        } else if (getTipoPagamento() == TipoPagamento.BOLETO) {
            System.out.println("Pagamento com boleto");
        } else if (getTipoPagamento() == TipoPagamento.DINHEIRO) {
            System.out.println("Pagamento com dinheiro");
        } else if (getTipoPagamento() == TipoPagamento.CRIPTOMOEDA) {
            System.out.println("Pagamento com criptomoeda");
        }

        System.out.println("Valor total: " + getValorTotal());

        System.out.println("Entrega: " + entregar());

    }

}
